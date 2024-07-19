package bstGithubPractice;

/*
    Given an unsorted integer array that represents binary search tree (BST) keys,
     construct a height-balanced BST from it. For each node of a height-balanced tree,
     the difference between its left and right subtree height is at most 1.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConvertToBalancedTree {

    private  List<Integer> values = new LinkedList<>();
    Node root;
    ConvertToBalancedTree(){
        root = null;
    }
    class Node {

        Node left = null, right = null;
        int data;
        Node(int data){
            this.data = data;
        }
    }

    public void insert(int data){
        root = insertHelper(root,data);
    }

    private  Node insertHelper(Node root,int data){

        if (root == null){
            return root =  new Node(data);
        } else if (root.data > data) {
            root.left = insertHelper(root.left,data);
        }
        else {
            root.right = insertHelper(root.right,data);
        }
        return root;
    }

    public void inOrder(Node root){

        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }

    public int[] getInOrderValues(Node root){
        values.clear();
        inOrder(root);

        int[] result = new int[values.size()];
        for (int i = 0 ;i< values.size() ; i++){
            result[i] = values.get(i);
        }
        return result;

    }

    public  void convert(int[] data){
        Arrays.sort(data);
        root = conversionHelper(data,0,data.length - 1,null);
    }

    public Node conversionHelper(int[] data, int low, int high, Node root){
        if (low > high){
            return root;
        }

        int mid = (low + high) / 2;

        root = new Node(data[mid]);
        root.left = conversionHelper(data,low,mid - 1 , root.left);
        root.right = conversionHelper(data,mid+1,high,root.right);
        return root;
    }

}

class Main{

    public static void main(String[] args) {
        ConvertToBalancedTree balancedTree = new ConvertToBalancedTree();
        balancedTree.insert(43);
        balancedTree.insert(22);
        balancedTree.insert(20);
        balancedTree.insert(50);
        balancedTree.insert(33);
        balancedTree.insert(90);

        balancedTree.inOrder(balancedTree.root);
        System.out.println(balancedTree.root.data);
        System.out.println("++++++++++");
        int[] keys = {43,22,20,50,33,90};
        balancedTree.convert(keys);
        balancedTree.inOrder(balancedTree.root);
        System.out.println(balancedTree.root.data);

//        System.out.println(balancedTree.root.data);
//        int[] values = balancedTree.getInOrderValues(balancedTree.root);
//        for (int val : values){
//            System.out.print(val);
//        }
//        balancedTree.convert(values);
//        balancedTree.inOrder(balancedTree.root);
//        System.out.println(balancedTree.root.data);
////        System.out.println(balancedTree.root.data);

    }

}
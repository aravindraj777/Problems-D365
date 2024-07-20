package github.bstGithubPractice;

/*
    Find k’th largest node in a BST
 */

import java.util.concurrent.atomic.AtomicInteger;

public class KthLargestAndKthSmallest {

    public static ValidBstRecursive.Node kthLargest(ValidBstRecursive.Node root, int k){

        AtomicInteger i = new AtomicInteger(0);
        return kthLargestHelper(root,i,k);
    }

    public  static ValidBstRecursive.Node kthLargestHelper(ValidBstRecursive.Node root, AtomicInteger i , int k){


        if (root == null){
            return null;
        }

        ValidBstRecursive.Node left = kthLargestHelper(root.right,i,k);

        if (left!= null){
            return left;
        }

        if (i.incrementAndGet() == k){
            return root;
        }
        return kthLargestHelper(root.left,i,k);
    }


    public static void main(String[] args) {

        ValidBstRecursive validation = new ValidBstRecursive();

        validation.insert(45);
        validation.insert(47);
        validation.insert(33);
        validation.insert(90);
        validation.insert(11);
//        validation.inOrder(validation.root);

        int k = 1;
        ValidBstRecursive.Node root  = kthLargest(validation.root,k);

        if (root != null) {
            System.out.println(root.value);
        }
        else {
            System.out.println("Invalid Input");
        }
    }

}

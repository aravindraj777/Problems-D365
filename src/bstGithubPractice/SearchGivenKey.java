package bstGithubPractice;

/*
Given a BST, write an efficient function to search a given key in it.
The algorithm should return the parent node of the key and print if the key
is the left or right node of the parent node. If the key is not present in the
BST, the algorithm should be able to determine that.
*/




class Node {
    int data;
    Node left = null , right = null;
    Node(int data){
        this.data = data;
    }
}
public class SearchGivenKey {

    Node root;
    SearchGivenKey(){
        root = null;
    }

    public void insert(int key){
        root = insertionHelper(root,key);
    }

    private static Node insertionHelper(Node root,int key){

        if (root == null){
            return root = new Node(key);
        } else if (root.data > key) {
            root.left = insertionHelper(root.left,key);
        }
        else {
            root.right = insertionHelper(root.right,key);
        }
        return root;
    }

//    search

    public static void search(Node root, int key ,Node parent){

        if (root == null){
            System.out.println("Key not found");
            return;
        }

        if (root.data == key){
            if (parent == null){
                System.out.println("The node with key "+ key + "is root node");
            }
            else if (key < parent.data){
                System.out.println("This given key is the left node of the node "+ "with key " + parent.data);
            }
            else {
                System.out.println("The given key is the right node of the node  "+"with key "+parent.data);
            }
            return;
        }

        if (key < root.data){
            search(root.left,key,root);
        }
        else {
            search(root.right,key,root);
        }
    }

    public void inOrderTraversal(Node root){

        if (root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }

    public static void main(String[] args) {

        SearchGivenKey treeSearch = new SearchGivenKey();
        treeSearch.insert(90);
        treeSearch.insert(22);
        treeSearch.insert(10);

        treeSearch.inOrderTraversal(treeSearch.root);

        SearchGivenKey.search(treeSearch.root,10,null);
    }




}

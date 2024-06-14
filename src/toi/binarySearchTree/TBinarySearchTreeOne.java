package toi.binarySearchTree;

public class TBinarySearchTreeOne {


    TreeNode root;

    TBinarySearchTreeOne(){
        root = null;
    }

   static class TreeNode{

        TreeNode right;
        TreeNode left;
        int value;

        TreeNode(int value){
            this.value = value;
            right = left = null;
        }
    }

    public void addNode(int value){
        root = addNodeHelper(root,value);
    }
    private TreeNode addNodeHelper(TreeNode root,int value){

        if (root == null){
            root = new TreeNode(value);
            return root;
        }

        else if (root.value > value){
            root.left = addNodeHelper(root.left,value);
        } else if (root.value < value) {
            root.right  =addNodeHelper(root.right,value);
        }
        return root;
    }

    public void inOrderTraversal(TreeNode root){

        if (root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.value+" ");
        inOrderTraversal(root.right);
    }

    public void deleteValue(int value){
        root = deleteValueHelper(root,value);
    }

    private TreeNode deleteValueHelper(TreeNode root , int value){

        if (root == null){
            return null;
        } else if (root.value > value) {
           root.left = deleteValueHelper(root.left,value);
        } else if (root.value < value) {
            root.right = deleteValueHelper(root.right,value);

        }
        else{

            if (root.right == null && root.left == null){
                return null;
            } else if (root.right == null) {
                root = root.left;
            }
            else if (root.left == null){
                root = root.right;
            }
            else {
                int minValue = inOrderSuccessor(root.right);
                root.value = minValue;
                root.right = deleteValueHelper(root.right,minValue);
            }
        }
        return root;
    }

    private int inOrderSuccessor(TreeNode root){

        TreeNode curr = root;
        if (curr.left  != null){
            curr = curr.left;
        }
        return curr.value;
    }
}

class BSTOneMain{

    public static void main(String[] args) {
        TBinarySearchTreeOne binarySearchTreeOne = new TBinarySearchTreeOne();
        binarySearchTreeOne.addNode(67);
        binarySearchTreeOne.addNode(56);
        binarySearchTreeOne.addNode(21);
        binarySearchTreeOne.addNode(90);

        binarySearchTreeOne.inOrderTraversal(binarySearchTreeOne.root);
        binarySearchTreeOne.deleteValue(56);
        binarySearchTreeOne.inOrderTraversal(binarySearchTreeOne.root);
    }


}
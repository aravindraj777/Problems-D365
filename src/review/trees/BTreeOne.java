package review.trees;

public class BTreeOne {

    Node root;

    BTreeOne(){
        root = null;
    }
    class Node{

        Node right;
        Node left;
        int value;

        Node(int value){
            this.value = value;
            this.right = this.left = null;
        }
    }

    public void addToTree(int value){
        root = addToTree(root,value);
    }

    public Node addToTree(Node root, int value){

        if (root == null){
            root = new Node(value);
            return root;
        }
        else if (root.value < value){
            root.right = addToTree(root.right,value);

        }
        else if (root.value > value){
            root.left = addToTree(root.left,value);
        }
        return root;

    }

    public void deleteNode(int value){
        root  = deletionHelper(root,value);
    }

    public Node deletionHelper(Node root,int value){

        if(root == null){
            return null;
        } else if (root.value > value) {
            root.left = deletionHelper(root.left,value);
        }
        else if (root.value < value){
            root.right = deletionHelper(root.right,value);
        }

        else {

            if(root.right == null && root.left == null){
                return null;
            } else if (root.left == null) {
                root = root.right;
            }
            else if (root.right == null){
                root = root.left;
            }
            else {

                Node minimumValue = minValue(root.right);
                root.value = minimumValue.value;
                root.right = deletionHelper(root.right,minimumValue.value);
            }
        }
        return root;
    }

    public Node minValue(Node root){

        Node curr = root;

        while (curr.left != null){
            curr = curr.left;
        }
        return curr;
    }

    public void inOrder(Node root){

        if (root == null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.value + " ");
        inOrder(root.right);

    }
}

class MainBsOne{

    public static void main(String[] args) {

        BTreeOne bTreeOne = new BTreeOne();
        bTreeOne.addToTree(10);
        bTreeOne.addToTree(56);
        bTreeOne.addToTree(11);
        bTreeOne.addToTree(88);
        bTreeOne.addToTree(58);

        bTreeOne.inOrder(bTreeOne.root);
        bTreeOne.deleteNode(88);
        System.out.println("---------------------");
        bTreeOne.inOrder(bTreeOne.root);
    }
}

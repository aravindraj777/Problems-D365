package review.tries;

import java.util.ArrayList;
import java.util.HashMap;

public class RTrie3 {

    Node root ;

    RTrie3(){
        root = new Node();
    }
    class Node{

        HashMap<Character,Node> children;
        boolean isWordEnd;

        Node (){
            children = new HashMap<>();
            isWordEnd = false;
        }
    }

    public void insertElement(String str){

        Node curr = root;
        for (int i = 0; i < str.length() ; i++){
            char ch = str.charAt(i);

            if (!curr.children.containsKey(ch)){
                curr.children.put(ch,new Node());
            }
            curr = curr.children.get(ch);
        }
        curr.isWordEnd = true;
    }

    public ArrayList<String> traversal(Node root){
        ArrayList<String> words = new ArrayList<>();
        traversalHelper(root,"",words);
        return words;
    }

    public void traversalHelper(Node root,String word, ArrayList<String> words){

        if (root.isWordEnd){
            words.add(word);
        }

        for (char ch : root.children.keySet()){
            traversalHelper(root.children.get(ch),word+ch,words);
        }
    }

    public boolean startsWith(String prefix){
        Node curr = root;
        for (char ch : prefix.toCharArray()){
            if (!curr.children.containsKey(ch)){
                return false;
            }
            curr = curr.children.get(ch);
        }
        return true;
    }
}

class RThreeMain{

    public static void main(String[] args) {

        RTrie3 rTrie3 = new RTrie3();
        rTrie3.insertElement("Abhay");
        rTrie3.insertElement("Uber");
        System.out.println(rTrie3.traversal(rTrie3.root));
        System.out.println(rTrie3.startsWith("Abhay"));
    }
}

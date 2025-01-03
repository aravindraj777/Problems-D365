package trie;

import java.util.ArrayList;
import java.util.HashMap;

public class TrieSix {

    TrieSix.Node root;

    TrieSix(){
        root = new TrieSix.Node();
    }
    class Node {

        HashMap<Character, TrieSix.Node> children;
        boolean isWordEnd;

        Node(){
            children = new HashMap<>();
            isWordEnd = false;
        }
    }

    public void addElement(String str){

        TrieSix.Node curr = root;
        for (int i = 0 ;i<str.length();i++){
            char ch = str.charAt(i);

            if (!curr.children.containsKey(ch)){
                curr.children.put(ch,new TrieSix.Node());
            }
            curr = curr.children.get(ch);

        }
        curr.isWordEnd = true;
    }

    public ArrayList<String> traversal(){
        ArrayList<String> words = new ArrayList<>();
        traversalHelper(words,"",root);
        return words;
    }

    public void traversalHelper(ArrayList<String> words, String word, TrieSix.Node curr){

        if (curr.isWordEnd){
            words.add(word);
        }

        for (char ch: curr.children.keySet()){
            traversalHelper(words,word+ch,curr.children.get(ch));
        }

    }
}

class SixTMain {

    public static void main(String[] args) {

        TrieFive trieFive = new TrieFive();
        trieFive.addElement("Banana");
        System.out.println(trieFive.traversal());
    }

}

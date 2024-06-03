package trie;

import java.util.ArrayList;
import java.util.HashMap;

public class TrieThree {

    Node root;

    TrieThree(){
        root = new Node();
    }
    static class Node{

        HashMap<Character,Node> children;
        boolean isWordEnd;

        Node (){
            children = new HashMap<>();
            isWordEnd = false;
        }
    }

    public void addElement(String str){

        Node curr = root;
        for (int i = 0 ; i< str.length() ; i++){
            char ch = str.charAt(i);
            if (!curr.children.containsKey(ch)){
                curr.children.put(ch,new Node());
            }
            curr  = curr.children.get(ch);
        }
        curr.isWordEnd = true;
    }

    public ArrayList<String> traversal(){
        ArrayList<String> words = new ArrayList<>();
        traversalHelper(words,"",root);
        return words;
    }
    public void  traversalHelper(ArrayList<String> words,String word,Node root){

        if (root.isWordEnd){
            words.add(word);
        }

        for (char ch: root.children.keySet()){
            traversalHelper(words,word+ch,root.children.get(ch));
        }
    }
}

class TrieThreeMain {
    public static void main(String[] args) {


        TrieThree trieThree = new TrieThree();
        trieThree.addElement("Banana");
        trieThree.addElement("Banyan");
        System.out.println(trieThree.traversal());
    }
}
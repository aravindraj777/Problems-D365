package trie;

import java.util.ArrayList;
import java.util.HashMap;

public class TrieOne {

    Node root;

    TrieOne(){
        root = new Node();
    }

    class Node {

        HashMap<Character,Node>children;
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

            if(!curr.children.containsKey(ch)){
                curr.children.put(ch,new Node());
            }
            curr = curr.children.get(ch);
        }
        curr.isWordEnd = true;
    }



    public ArrayList<String> traversal(){
        ArrayList<String> words = new ArrayList<>();
        traverseHelper(words,"",root);
        return words;
    }

    public void traverseHelper(ArrayList<String> words,String word,Node curr){

        if(curr.isWordEnd){
            words.add(word);
        }
        for (char ch : curr.children.keySet()){
            traverseHelper(words,word+ch,curr.children.get(ch));
        }
    }
}

class TOneMain{
    public static void main(String[] args) {

        TrieOne trieOne = new TrieOne();
        trieOne.addElement("Aravind");
        trieOne.addElement("Arun");

        System.out.println(trieOne.traversal());
    }
}
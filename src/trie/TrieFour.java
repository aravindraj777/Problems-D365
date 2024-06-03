package trie;

import java.util.ArrayList;
import java.util.HashMap;

public class TrieFour {

    Node root;

    TrieFour(){
        root = new Node();
    }

    class Node {

        HashMap<Character,Node> children;
        boolean isWordEnd;

        Node(){
            children = new HashMap<>();
            isWordEnd = false;
        }
    }

    public void insert(String str){

        Node curr = root;

        for (int i = 0 ;i<str.length() ; i++){

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
        traversalHelper(root,"",words);
        return words;
    }

    public void traversalHelper(Node root,String word,ArrayList<String> words){

        if(root.isWordEnd){
            words.add(word);
        }

        for (char ch : root.children.keySet()){
            traversalHelper(root.children.get(ch),word+ch,words);
        }
    }
}

class TrieFourMain {

    public static void main(String[] args) {

        TrieFour trieFour = new TrieFour();
        trieFour.insert("Aravind");

        System.out.println(trieFour.traversal());
    }
}














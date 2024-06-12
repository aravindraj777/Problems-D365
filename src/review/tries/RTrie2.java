package review.tries;

import java.util.ArrayList;
import java.util.HashMap;

public class RTrie2 {

    Node root;
    RTrie2(){
        root = new Node();
    }
    class Node{
        HashMap<Character,Node> children;
        boolean isWordEnd;

        Node(){
            children = new HashMap<>();
            isWordEnd = false;
        }
    }

    public void insertElement(String str){

        Node curr  = root;
        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if (!curr.children.containsKey(ch)){
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

        if (root.isWordEnd){
            words.add(word);
        }
        for (char ch:root.children.keySet()){
            traversalHelper(root.children.get(ch),word+ch,words);
        }
    }

    public boolean search(String word){
        Node curr = root;
        for (char ch: word.toCharArray()){
            if (!curr.children.containsKey(ch)){
                return false;
            }
            curr = curr.children.get(ch);
        }
        return curr.isWordEnd;
    }
    public boolean startsWith(String prefix){

        Node p = root;
        for (char ch:prefix.toCharArray()){
            if (!p.children.containsKey(ch)){
                return false;
            }
            p = p.children.get(ch);
        }
        return true;
    }
}

class MainRTTwo{

    public static void main(String[] args) {

        RTrie2 rTrie2 = new RTrie2();
        rTrie2.insertElement("Aravind");
        rTrie2.insertElement("Fishey");
        System.out.println(rTrie2.traversal());

        System.out.println(rTrie2.search("Aravind"));
        System.out.println(rTrie2.startsWith("Ar"));
    }

}
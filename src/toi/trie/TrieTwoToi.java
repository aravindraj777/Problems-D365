package toi.trie;

import java.util.ArrayList;
import java.util.HashMap;

public class TrieTwoToi {

    Node root;
    TrieTwoToi(){
        root = new Node();
    }
    class Node {
        HashMap<Character,Node> children;
        boolean isWordEnd;

        Node (){
            children = new HashMap<>();
            isWordEnd = false;
        }

    }

    public void addElement(String str){

        Node curr = root;
        for (int i = 0 ;i < str.length() ;i++){
            char ch = str.charAt(i);

            if (!curr.children.containsKey(ch)){
                curr.children.put(ch,new Node());
            }
            curr = curr.children.get(ch);
        }
        curr.isWordEnd = true;
    }



    public void printTrie(){
        printTrieHelper(root,0);
    }

    public void printTrieHelper(Node curr,int level){

        for (char ch : curr.children.keySet()){
            for (int i = 0 ;i<level ;i++){
                System.out.print(" ");
            }
            System.out.println(ch);
            printTrieHelper(curr.children.get(ch),level+1);
        }

        if (curr.isWordEnd){
            for (int i = 0 ;i< level ;i ++){
                System.out.print(" ");
            }
            System.out.println("(word End)");
        }
    }


}

class TrieTwoToiMain{

    public static void main(String[] args) {

        TrieTwoToi trieTwoToi = new TrieTwoToi();
        trieTwoToi.addElement("Sreekant");
        trieTwoToi.addElement("Abhi");
        trieTwoToi.addElement("Sreevidhya");
        trieTwoToi.addElement("Abhinand");
        trieTwoToi.printTrie();
    }
}

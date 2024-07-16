package toi.trie;

import java.util.HashMap;

public class SuffixTrie {

    class Node {
        HashMap<Character, Node> children;
        boolean isWordEnd;

        Node() {
            children = new HashMap<>();
            isWordEnd = false;
        }
    }

    Node root;

    SuffixTrie() {
        root = new Node();
    }

    public void insertSuffixes(String word) {
        for (int i = 0; i < word.length(); i++) {
            insert(word.substring(i));
        }
    }

    private void insert(String suffix) {
        Node curr = root;
        for (int i = 0; i < suffix.length(); i++) {
            char ch = suffix.charAt(i);
            if (!curr.children.containsKey(ch)) {
                curr.children.put(ch, new Node());
            }
            curr = curr.children.get(ch);
        }
        curr.isWordEnd = true;
    }

    public void printSuffixes(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(i));
        }
    }

    public static void main(String[] args) {
        SuffixTrie suffixTrie = new SuffixTrie();
        suffixTrie.insertSuffixes("banana");
        suffixTrie.printSuffixes("banana");
    }
}

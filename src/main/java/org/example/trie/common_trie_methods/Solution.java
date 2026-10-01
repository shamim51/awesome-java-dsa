package org.example.trie.common_trie_methods;

import org.example.trie.utils.TrieNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private TrieNode root;

    public void createTrie(String[] words){
        root = new TrieNode();
        for(String word: words){
            insert(word);
        }
    }

    public void insert(String word){
        TrieNode node = root;
        for (char ch : word.toCharArray()){
            if(!node.children.containsKey(ch)){
                node.children.put(ch, new TrieNode());
            }
            node = node.children.get(ch);
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        /**
         * Search the trie for the given word.
         *
         * Returns true if the word exists in the trie, false otherwise
         */
        TrieNode node = root;
        for (char ch: word.toCharArray()){
            if(!node.children.containsKey(ch)) {
                return false;
            }

            node = node.children.get(ch);
        }
        return node.isEndOfWord;
    }

    public void delete(String word) {
        /**
         * Deletes the given word from the Trie.
         *
         * Returns nothing.
         */
        // === YOUR CODE HERE ===
    }

    public Boolean[] trie(String[] initialWords, String[][] commands) {
        createTrie(initialWords);

        List<Boolean> output = new ArrayList<>();
        for (String[] command : commands) {
            if (command[0].equals("search")) {
                output.add(search(command[1]));
            } else if (command[0].equals("delete")) {
                delete(command[1]);
            }
        }
        return output.toArray(new Boolean[0]);
    }

    public static void main(String[] args) {

    }
}

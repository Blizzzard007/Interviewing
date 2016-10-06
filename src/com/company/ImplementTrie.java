package com.company;

/**
 * Created by hongruzh on 9/22/16.
 */
public class ImplementTrie {

        private TrieNode root;

        public ImplementTrie() {
            root = new TrieNode();
        }

        // Inserts a word into the trie.
        public void insert(String word) {
            TrieNode node = root;
            for(char c:word.toCharArray()){
                if(node.children[c-'a']==null){
                    node.children[c-'a'] = new TrieNode();
                }
                node = node.children[c-'a'];
            }
            node.item = word;
        }

        // Returns if the word is in the trie.
        public boolean search(String word) {
            TrieNode node = root;
            for(char c:word.toCharArray()){
                if(node.children[c-'a']==null) return false;
                else{
                    node = node.children[c-'a'];
                }
            }
            return word.equals(node.item);
        }

        // Returns if there is any word in the trie
        // that starts with the given prefix.
        public boolean startsWith(String prefix) {
            TrieNode node = root;
            for(char c: prefix.toCharArray()){
                if(node.children[c-'a']==null) return false;
                node = node.children[c-'a'];
            }
            return true;
        }
    }

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");


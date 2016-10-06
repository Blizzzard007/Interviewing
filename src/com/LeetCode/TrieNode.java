package com.LeetCode;

/**
 * Created by hongruzh on 10/5/16.
 */
public class TrieNode {

    TrieNode[] childrens;
    String item;
    public TrieNode(){
        childrens = new TrieNode[26];
        item = "";
    }

    TrieNode root = new TrieNode();

    public void addword(String word){
        char[] wordArray = word.toCharArray();
        TrieNode node = root;
        for(char c: wordArray){
            if(node.childrens[c-'a']==null){
                node.childrens[c-'a'] = new TrieNode();
            }else{
                node = node.childrens[c-'a'];
            }
        }
        node.item=word;
    }

    public boolean search(String word){
        TrieNode node = root;
        char[] wordArray = word.toCharArray();
        for(char c:wordArray){
            if(node.childrens[c-'a']==null) return false;
            node = node.childrens[c-'a'];
        }
        return node.item==word;
    }
}

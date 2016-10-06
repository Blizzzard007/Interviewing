package com.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by hongruzh on 10/3/16.
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        if(s==null||s.length()<2) return 0;


        Queue<String> queue = new LinkedList<String>();
        queue.offer(s);
        int max = Integer.MIN_VALUE;

        while(!queue.isEmpty()){
            String str = queue.poll();
            if(validParentheses(str)) return str.length();
            for(int i=0;i<str.length();i++){
                String str1 = str.substring(0,i)+str.substring(i+1);

                // System.out.println(str1.substring(0,i));
                // System.out.println(str1.substring(i));

                if(validParentheses(str1)){
                    System.out.println(str1);
                    System.out.println(validParentheses(str1));
                    return Math.max(str.length(),max);
                }else{
                    queue.offer(str1);
                }
            }
        }
        return 0;
    }

    public boolean validParentheses(String s){

        int count = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')  count++;
            if(s.charAt(i)==')'){
                if(count==0) return false;
                else{
                    count--;
                }
            }
        }
        return count==0;
    }
}

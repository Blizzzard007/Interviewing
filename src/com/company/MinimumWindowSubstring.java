package com.company;

import java.util.HashMap;

/**
 * Created by hongruzh on 9/18/16.
 */
public class MinimumWindowSubstring {
    public String minWindow(String s,String t){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        String result = "";

        for(int i=0;i<t.length();i++){
            Character c = t.charAt(i);
            if(!map.containsKey(t.charAt(i))){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }

        int start=0;
        int L = 0;
        int dis = s.length()+1;
        int n = t.length();

        for(int i=0;i<s.length();i++){
            Character cc = s.charAt(i);
            if(map.containsKey(cc)){
                map.put(cc,map.get(cc)-1);
                if(map.get(cc)>=0)
                    n-=1;
            }
            if(n==0){
                while(start<=i){
                    if(map.containsKey(s.charAt(start))){
                        if (map.get(s.charAt(start))<0)
                            map.put(s.charAt(start), map.get(s.charAt(start)) + 1);
                        else{
                            break;
                        }
                    }
                    start+=1;
                }
                if(i-start+1<dis){
                    dis = i-start+1;
                    L = start;
                }

            }
        }
        if(dis!=s.length()+1){
            return s.substring(L,L+dis);
        }
        else {
            return result;
        }
    }
}

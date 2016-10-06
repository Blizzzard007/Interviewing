package com.LeetCode;

import java.util.*;

/**
 * Created by hongruzh on 9/25/16.
 */
public class ReranggeString {
    public String rearrange(String str,int k){
        if(str==null||str.length()==0){
            return "";
        }
        if(k==0){
            return str;
        }
        char[] arr = str.toCharArray();
        int n = arr.length;
        Map<Character,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

//        for (int i = 0; i < n; i++) {
//            char c = arr[i];
//            int count = map.getOrDefault(c, 0) + 1;
//            map.put(c, count);
//        }

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        pq.addAll(map.entrySet());

        Deque<Map.Entry<Character, Integer>> queue = new ArrayDeque<>(k);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (pq.size() == 0) {
                return "";
            }
            Map.Entry<Character, Integer> entry = pq.remove();
            sb.append(entry.getKey());
            int newVal = entry.getValue() - 1;
            entry.setValue(newVal);

            queue.offer(entry);
            if (queue.size() == k) {
                Map.Entry<Character, Integer> poll = queue.poll();
                if (poll.getValue() > 0) {
                    pq.add(poll);
                }
            }
        }

        return sb.toString();
    }
}

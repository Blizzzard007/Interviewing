package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hongruzh on 9/26/16.
 */
public class longestConsecutive {
       public int longestConsecutive(int[] nums){
           UF uf = new UF(nums.length);
           Map<Integer,Integer> map = new HashMap<Integer,Integer>();
           for(int i=0;i<nums.length;i++){
               if(map.containsKey(nums[i])){
                   continue;
               }
               map.put(nums[i],i);
               if(map.containsKey(nums[i]+1)){
                   uf.union(i,map.get(nums[i]+1));
               }
               if(map.containsKey(nums[i]-1)){
                   uf.union(i,map.get(nums[i]-1));
               }
           }
           System.out.println(uf.maxUnion());
           return uf.maxUnion();
       }
}

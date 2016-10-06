package com.Facebook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by hongruzh on 10/5/16.
 */
public class SortPartialArray {
    public int[] mergeKSortedArraySegment(int[] nums){
        int n = nums.length;
        if(n<=1) return nums;
        int start = 0;
        ArrayList<arrayPair> list = new ArrayList<arrayPair>();

        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                list.add(new arrayPair(start,i));
                start = i;
            }
        }
        list.add(new arrayPair(start,n));
        if(list.size()==1) return nums;

        // 1,3,5,4,7,9,8,10,12
        PriorityQueue<arrayPair> pq = new PriorityQueue<arrayPair>(new Comparator<arrayPair>() {
            @Override
            public int compare(arrayPair o1, arrayPair o2) {
                return nums[o1.start]-nums[o2.start];
            }
        });

        for(int i=0;i<list.size();i++){
            pq.offer(list.get(i));
        }
        System.out.println(pq.size());

        int[] result = new int[n];

        int i = 0;
        while(!pq.isEmpty()){
            arrayPair segment = pq.poll();
            int segmentStart = segment.start;
            int segmentEnd = segment.end;
//            System.out.println(segment.start);
            result[i++] = nums[segment.start];
            if(segment.addNumberStart(segmentStart, segmentEnd)!=null){
                pq.offer(segment.addNumberStart(segmentStart, segmentEnd));
            }

        }


        return result;
    }

    class arrayPair{
        int start;
        int end;
        public arrayPair(int start,int end){
            this.start = start;
            this.end = end;
        }

        public arrayPair addNumberStart(int start,int end){
            if(start+1<end){
                return new arrayPair(start+1,end);
            }
            else return null;
        }
    }
}

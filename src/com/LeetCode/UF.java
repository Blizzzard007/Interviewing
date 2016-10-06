package com.LeetCode;

/**
 * Created by hongruzh on 9/26/16.
 */
public class UF {
    public int[] father;
    public int count;
    public UF(int count){
        father = new int[count];
        this.count = count;
        for(int i=0;i<father.length;i++){
            father[i] = i;
        }
    }

    public int find(int node){
        return father[node];
    }


    public void union(int node1,int node2){
        int source = find(node1);
        int destination = find(node2);
        if(source!=destination){
            for(int i=0;i<father.length;i++){
                if(father[i]==source){
                    father[i] = destination;
                }
            }
        }
    }

    // public boolean isConnected(int node1,int node2){
    //     return find(node1)==find(node2);
    // }

    public int maxUnion(){
        int max = Integer.MIN_VALUE;
        int[] countMax = new int[father.length];
        for(int i=0;i<father.length;i++){
            countMax[father[i]]++;
            //System.out.println(countMax[father[i]]);

        }
        for(int i=0;i<countMax.length;i++){
            max = Math.max(countMax[i],max);
        }
        System.out.println(max);
        return max;
    }
}

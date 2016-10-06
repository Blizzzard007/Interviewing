package com.LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hongruzh on 9/26/16.
 */
public class countComponents {
    private int[] father;
    public int countComponents(int n,int[][] edges){
        Set<Integer> set = new HashSet<Integer>();
        father = new int[n];
        for(int i=0;i<n;i++){
            father[i] = i;
        }

        for(int i=0;i<edges.length;i++){
            union(edges[i][0],edges[i][1]);
        }

        for(int i=0;i<n;i++){
            set.add(find(i));
        }
        return set.size();
    }

    public int find(int node){
        if(father[node] == node){
            return node;
        }
        father[node] = find(father[node]);
        return father[node];
    }
    public void union(int node1,int node2){
        father[find(node1)] = find(node2);
    }
}

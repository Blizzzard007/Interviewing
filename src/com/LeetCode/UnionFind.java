package com.LeetCode;

/**
 * Created by hongruzh on 9/26/16.
 */
public class UnionFind {
    int[] ids;
    int cnt;

    public UnionFind(int size){
        this.ids = new int[size];
        for(int i=0;i<size;i++){
            this.ids[i] = i;
        }
        this.cnt = size;
    }

    public boolean union(int m,int n){
        int source = find(m);
        int destination = find(n);
        if(source!=destination){
            for(int i=0;i<ids.length;i++){
                if(ids[i]==source){
                    ids[i] = destination;
                }
            }
            cnt--;
            return true;
        }else{
            return false;
        }
    }

    public int find(int m){
        return ids[m];
    }

    public boolean areConnected(int m,int n){
        return find(m)==find(n);
    }

    public int count(){
        return cnt;
    }

}

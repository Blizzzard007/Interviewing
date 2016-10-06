package com.LeetCode;

/**
 * Created by hongruzh on 9/26/16.
 */
public class GraphValidTree {
    public boolean validTree(int n,int[][] edges){
        UnionFind uf = new UnionFind(n);
        for(int i=0;i<edges.length;i++){
            if(uf.union(edges[i][0],edges[i][1])){
                return false;
            }
        }
        return uf.count()==1;
    }
}

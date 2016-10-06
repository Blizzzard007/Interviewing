package com.Amazon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by hongruzh on 9/23/16.
 */
public class CityMST {
    //求最小生成树的算法
    //1. Prim算法
    //先找到最小的边,然后以该条边包含的节点为基础，去求出来和这些节点连起来距离最短的边
    //2. Kruskal Algorithm
    //对所有的边长进行排序。每次选出来最短的一条边。 第二次选出来的是剩下所有边中最短的边

    public static void main(String args){
        Connection[] citys = new Connection[10];
        citys[0] = new Connection("A","B",6);
        citys[1] = new Connection("A","D",1);
        citys[2] = new Connection("A","E",5);
        citys[3] = new Connection("B","C",3);
        citys[4] = new Connection("B","D",5);
        citys[5] = new Connection("C","D",6);
        citys[6] = new Connection("C","F",6);
        citys[7] = new Connection("D","F",4);
        citys[8] = new Connection("D","E",5);
        citys[9] = new Connection("E","F",2);
        ArrayList<Connection> list = new ArrayList<Connection>();
        for(Connection temp:citys){ list.add(temp);}

        for(Connection temp:findPath(list)){ temp.printConnection();}

    }

    public static List<Connection> findPath(List<Connection> list){
        ArrayList<Connection> result = new ArrayList<Connection>();
        ArrayList<String> cityTree = new ArrayList<>();

        while(!list.isEmpty()){
            Connection temp = findMin(list,cityTree);
            if(temp == null){
                break;
            }
            list.remove(temp);
            cityTree.add(temp.city1);
            cityTree.add(temp.city2);
            result.add(temp);
        }

        Comparator<Connection> cmp = new Comparator<Connection>(){
            public int compare(Connection c1,Connection c2) {
                if (c1.city1.equals(c2.city1)) {
                    return c1.city2.compareTo(c2.city2);
                }
                return c1.city1.compareTo(c2.city1);
            }};
        result.sort(cmp);
        return result;
    }

    public static Connection findMin(List<Connection> list,ArrayList<String> cityTree){
        Connection result = null;
        int minCost = Integer.MAX_VALUE;
        for(Connection con : list){
            if(con.cost<=minCost){
                if((cityTree.contains(con.city1)&&!cityTree.contains(con.city2))||cityTree.contains(con.city2)&&!cityTree.contains(con.city1)){
                    minCost = con.cost;
                    result = con;
                }
                if(cityTree.isEmpty()){
                    minCost = con.cost;
                    result = con;
                }
            }
        }
        return result;
    }
}

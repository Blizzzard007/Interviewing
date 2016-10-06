package com.company;


//
//import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
//
//import java.util.ArrayList;
//import java.util.HashMap;

import com.Facebook.MoveZeros;
import com.Facebook.SortPartialArray;
import com.LeetCode.*;

import java.util.PriorityQueue;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
//
//        String s = "ADOBECODEBANC";
//        String t = "ABC";
//        MinimumWindowSubstring mm = new MinimumWindowSubstring();
//        mm.minWindow(s,t);
//        int[] A = {2,2,2,0,1,1,1,1};
//        SortColor ss = new SortColor();
//        ss.sortColors(A);
//        String str = "A man, A, maA";
//        String strChange = str.replaceAll("[^A-Za-z0-9]","").toLowerCase();
//        System.out.println(strChange);
//        ImplementTrie tt = new ImplementTrie();
//        tt.search("a");

//        String str = "How are you";
//        str.split(" ");
//        System.out.println(str);
//        ArrayList<Integer> list = new ArrayList<>();
//        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
//        map.put(1,new ArrayList<Integer>(1));
////        map.put(2,new ArrayList<Integer>(3));
//        int[][] pre = {{1,0},{2,1}};
////        CourseSchedule cc = new CourseSchedule();
////        cc.canFinish(3,pre);
//        SimplyPath ss = new SimplyPath();
//        String path ="/home/";
//        ss.simplifyPath(path);

//        ReranggeString ss = new ReranggeString();
//        String str = "aabbcc";
//        ss.rearrange(str,3);
//        int[][] position = {
//                {0,0},
//                {0,1},
//                {1,2},
//                {2,1},
//        };
//        numberofIsland nn = new numberofIsland();
//        int m = 3;
//        int n = 3;
//        nn.numIslands2(m,n,position);
//        longestConsecutive ll = new longestConsecutive();
//        int[] nums = {100,101,102,33,99};
//        ll.longestConsecutive(nums);
//
//        TreeNode root = new TreeNode(1);
//        TreeNode node1 = new TreeNode(2);
//        TreeNode node2 = new TreeNode(3);
//        TreeNode node3 = new TreeNode(4);
//        TreeNode node4 = new TreeNode(5);
//
//        root.left = node1;
//        root.right = node2;
//        node1.left = node3;
//        node1.right = node4;
//        FindLeavesofBinary ff = new FindLeavesofBinary();
//        ff.findLeaves(root);
//         int[] nums = {-2,0,3,-5,2,-1};
//
//          NumArray nn = new NumArray(nums);
        String s = "))))))))";

//        int left = 0;
//        while(s.length()>0){
//            if(s.charAt(0)==')'){
//                s = s.substring(1);
//                System.out.println(s);
//            }
//        }
//
//        Pattern MYFILTERS = Pattern.compile(".*(\\.(bmp|gif|jpe?g|png|tiff?))$");
//        String ContentType = "https://si.wsj.net/public/resources/images/BN-QB446_YHEALT_G_20160930133130.jpg";
//
//        if(MYFILTERS.matcher(ContentType).matches()){
//            System.out.println(1);
//
//        }
//
//
//
//
//        for(int i=0;i<s.length();i++){
//            for(int j=i;j<=s.length();j++){
//                System.out.println(s.substring(i,j));
//            }
//        }
//        TrieNode root = new TrieNode();
//        System.out.println('.'-'a');
//        System.out.println('b'-'a');
//          SlidingWindowMaximum ss = new SlidingWindowMaximum();
//          int[] num = {1,3,-1,-3,5,3,6,7};
//          System.out.println(ss.maxSlidingWindow(num, 3));
//          int[] nums = {0, 1, 0, 3, 12};
//          MoveZeros mm = new MoveZeros();
//          mm.moveZeroes(nums);
        int[] nums = {2,3,5,1,4,6,8,10,20,30,11,12,13};

        SortPartialArray ss = new SortPartialArray();
        int[] nums1 = ss.mergeKSortedArraySegment(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums1[i]);
        }
//        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//        pq.offer(null);
//        pq.offer(null);
//        System.out.println(pq.size());

//        LongestValidParentheses ll = new LongestValidParentheses();
//        System.out.println(ll.longestValidParentheses(s));








        // write your code here
    }
}

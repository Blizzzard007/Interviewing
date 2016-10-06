package com.company;

/**
 * Created by hongruzh on 10/2/16.
 */
public class NumArray{
    int[] prefixSum;
    public NumArray(int[] nums) {
        prefixSum = new int[nums.length+1];
        prefixSum[0] = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            prefixSum[i+1] = sum;

            System.out.println("prefixsum"+i+" "+prefixSum[i]);
        }

    }

    public int sumRange(int i, int j) {
        return prefixSum[j]-prefixSum[i-1];
    }
}


package com.Facebook;

/**
 * Created by hongruzh on 10/5/16.
 */
public class MoveZeros {
    public void moveZeroes(int[] nums){
        int j = nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=0) {
                nums[j] = nums[i];
                j--;
            }
        }
        for(int k = j;k>=0;k--){
            nums[k] = 0;
        }
    }
}

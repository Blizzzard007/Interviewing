package com.company;

/**
 * Created by hongruzh on 9/20/16.
 */
public class SortColor {
    public void sortColors(int[] A) {
        if(A==null || A.length==0)
            return;
        int[] res = new int[A.length];
        int[] helper = new int[3];
        for(int i=0;i<A.length;i++)
        {
            helper[A[i]]++;
        }
        for(int i=1;i<3;i++)
        {
            helper[i]=helper[i]+helper[i-1];
        }
        for(int i=A.length-1;i>=0;i--)
        {
            res[helper[A[i]]-1] = A[i];
            helper[A[i]]--;
        }
        for(int i=0;i<A.length;i++)
        {
            A[i] = res[i];
        }
    }
}

package com.ymd.算法.枚举;

public class 枚举递增 {
    public int incremovableSubarrayCount(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(isSort(nums,i,j))
                    count++;
            }
        }
        return count;
    }

    public boolean isSort(int[]num,int removeStart,int removeEnd) {
        int prev=-1;

        for (int i = 0; i < num.length; i++) {
            if(i>=removeStart&&i<=removeEnd){
                int curr=num[i];
                if(curr<prev){
                    return false;
                }
                prev=curr;
            }
        }

        return true;
    }
}

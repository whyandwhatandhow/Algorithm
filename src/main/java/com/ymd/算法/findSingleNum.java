package com.ymd.算法;
//数组中其他数字都出现了两次，只有一个数字出现一次，找出这个数
public class findSingleNum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,1,2,3};
        int x=0;
        for (int i = 0; i < a.length; i++) {
            x=a[i]^x;
        }
        System.out.println(x);
    }
}

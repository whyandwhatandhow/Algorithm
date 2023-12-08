package com.ymd.算法.位运算和二进制;
//数组中其他数字都出现了两次，只有一个数字出现一次，找出这个数
public class findSingleNum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,1,2,3,5,5,6,6,7,7,8,8,2,2,1,1};
        int x=0;
        for (int i = 0; i < a.length; i++) {
            x=a[i]^x;
        }
        System.out.println(x);
    }
}

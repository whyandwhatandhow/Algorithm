package com.ymd.算法.递归;

// 求阶乘
public class factorial {
    public static void main(String[] args) {
        int n=3;
        int a=f1(n);
        System.out.println(a);
    }

    public static int f1(int n){
        if(n==1)
            return 1;
        else {
            return n*f1(n-1);
        }
    }
}

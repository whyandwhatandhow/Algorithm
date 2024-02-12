package com.ymd.算法.递归;

public class fibnaqier {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fib(n));
    }

    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}

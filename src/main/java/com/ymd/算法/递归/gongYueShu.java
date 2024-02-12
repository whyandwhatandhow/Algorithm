package com.ymd.算法.递归;


//数学就找递推公式
public class gongYueShu {
    public static void main(String[] args) {
        int n=10;
        int m=7;
        System.out.println(yue(n,m));
    }

    public static int yue(int m,int n){
        if(n==0)
            return m;
        return yue(n,m%n);
    }
}

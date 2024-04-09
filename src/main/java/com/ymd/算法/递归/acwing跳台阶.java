package com.ymd.算法.递归;


import java.util.Scanner;

//一个楼梯共有 n
// 级台阶，每次可以走一级或者两级，问从第 0
// 级台阶走到第 n
// 级台阶一共有多少种方案。
//
//输入格式
//共一行，包含一个整数 n
//。
//
//输出格式
//共一行，包含一个整数，表示方案数。
//
//数据范围
//1≤n≤15
public class acwing跳台阶 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        //斐波那契数列
        System.out.println(fb(n));
    }

    public static int fb(int n){
        if(n==1||n==0||n==2){
            return n;
        }

        return fb(n-1)+fb(n-2);
    }
}

package com.ymd.算法.递归;

//从 1∼n
// 这 n
// 个整数中随机选取任意多个，输出所有可能的选择方案。
//
//输入格式
//输入一个整数 n
//。
//
//输出格式
//每行输出一种方案。
//
//同一行内的数必须升序排列，相邻两个数用恰好 1
// 个空格隔开。
//
//对于没有选任何数的方案，输出空行。
//
//本题有自定义校验器（SPJ），各行（不同方案）之间的顺序任意


//注意空行也算   类似予全排列  包括递归与回溯
import java.util.Scanner;


public class acwing指数枚举 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []label=new int[n+1];
        dfs(1,n,label);
    }

    public static void dfs(int x,int n,int []label){
        if(x>n){
            for (int i = 1; i <=n ; i++) {
                if(label[i]==1)
                    System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        //先选
        label[x]=1;
        dfs(x+1,n,label);
        label[x]=0;

        //不选
        label[x]=2;
        dfs(x+1,n,label);
        label[x]=0;
    }
}

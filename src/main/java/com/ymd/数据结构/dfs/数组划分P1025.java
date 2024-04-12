package com.ymd.数据结构.dfs;

import java.util.Scanner;

public class 数组划分P1025 {//用sum加入递归，不然不好判断

    static int count=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        dfs(1,n,k,1,0);
        System.out.println(count);
    }

    public static void dfs(int x,int n,int k,int start,int sum){
        if(sum>n){
            return;
        }
        if(x>k){
            if(sum==n){
                count++;
            }
            return;
        }

        for (int i = start; i <=n ; i++) {
                dfs(x+1,n,k,i,sum+i);
        }
    }

}

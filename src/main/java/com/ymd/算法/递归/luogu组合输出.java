package com.ymd.算法.递归;

import java.util.Scanner;

//1157 C53 排好序 输出所有组合 ---递归 回溯 剪枝
public class luogu组合输出 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int r=scanner.nextInt();

        int []nums=new int[n+1];
        dfs(1,1,n,r,nums);

    }
    //剪枝

    public static void dfs(int x,int start,int n, int r, int[] nums) {
        //if((x-1)+n-start+1<r){return;}
        if(x>r){
            for (int i=1;i<=r;i++){
                System.out.print(nums[i]+" ");
            }
            System.out.println();
            return;               //一定要记得终止
        }

        for (int i = start; i <=n ; i++) {
            nums[x]=i;
            dfs(x+1,i+1,n,r,nums);   //应该要i+1
            nums[x]=0;
        }
    }


}

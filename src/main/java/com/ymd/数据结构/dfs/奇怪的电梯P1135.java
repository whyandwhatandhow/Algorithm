package com.ymd.数据结构.dfs;

import java.util.Scanner;

public class 奇怪的电梯P1135 {
    static int min=99999;
    static int count=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//总共几楼
        int a=scanner.nextInt();//开始
        int b=scanner.nextInt();//结束
        int []nums=new int[n+1];//电梯
        for (int i = 1; i <=n ; i++) {
            nums[i]=scanner.nextInt();
        }

        dfs(a,b,n,nums);
        if(min==99999){
            System.out.println(-1);
        }else {
            System.out.println(min);
        }
    }

    public static void dfs(int a,int b,int n,int[]nums){
        if(count>n){
            return;
        }
        if(a==b){
            min=Math.min(min,count);
            return;
        }

        //上
        if(a+nums[a]<=n){
            count++;
            dfs(a+nums[a],b,n,nums);
        }

        //下
        if(a-nums[a]>0){
            count++;
            dfs(a-nums[a],b,n,nums);
        }
    }


}

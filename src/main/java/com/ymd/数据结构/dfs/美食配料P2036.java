package com.ymd.数据结构.dfs;

import java.util.Map;
import java.util.Scanner;

public class 美食配料P2036 {
    static int min=999999;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []sNums=new int[n+1];
        int []bNums=new int[n+1];
        int []nums=new int[n+1];
        for (int i = 1; i <= n; i++) {
            sNums[i]=scanner.nextInt();
            bNums[i]=scanner.nextInt();
        }
        dfs(1,n,sNums,bNums,nums,0);
        System.out.println(min);
    }

    public static void dfs(int x,int n,int []sNums,int []bNums,int []nums,int sum){
        if(x>n){
            int ss=1;
            int bb=0;
            for (int i = 1; i <=n ; i++) {
                if(nums[i]==1){
                    ss*=sNums[i];
                    bb+=bNums[i];
                    sum=Math.abs(ss-bb);
                    min=Math.min(sum,min);
                }
            }
            return;
        }

        //选
        nums[x]=1;
        dfs(x+1,n,sNums,bNums,nums,sum);
        nums[x]=0;


        //不选
        nums[x]=2;
        dfs(x+1,n,sNums,bNums,nums,sum);
        nums[x]=0;
    }
}

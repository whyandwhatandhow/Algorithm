package com.ymd.算法.递归;

import java.util.Scanner;

//P1036
public class luogu选数 {
    static int counts=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int []nums=new int[n+1];
        int []arr=new int[n+1];
        nums[0]=0;
        for (int i = 1; i <= n; i++) {
            nums[i]=scanner.nextInt();
        }
        dfs(1,1,nums,arr,n,k);
        System.out.println(counts);
    }

    public static void dfs(int x,int start,int []nums,int []arr,int n,int k){
        if(x>k){
            int sum=0;
            for (int i = 1; i <=n ; i++) {
                sum+=arr[i];
            }
            if(isZhi(sum)){
                counts++;
            }
            return;
        }

        for (int i = start; i <= n; i++) {
            arr[x]=nums[i];
            dfs(x+1,i+1,nums,arr,n,k);
            arr[x]=0;
        }

    }


    public static boolean isZhi(int num){
        int count=0;
        for (int i = 1; i <=num ; i++) {
            if(num%i==0)
                count++;
        }

        return count==2;
    }
}

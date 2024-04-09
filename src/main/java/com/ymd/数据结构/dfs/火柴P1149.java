package com.ymd.数据结构.dfs;

import java.util.Scanner;

public class 火柴P1149 {
    static int  count =0;
    public static void main(String[] args) {
        //a+b+c==n-4;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(); //多少个火柴
        n=n-4;
        int []arr=new int[800];
        int []nums=new int[800];
        nums[0]=6;
        nums[1]=2;
        nums[2]=5;
        nums[3]=5;
        nums[4]=4;
        nums[5]=5;
        nums[6]=6;
        nums[7]=3;
        nums[8]=7;
        nums[9]=6;
        for (int i = 10; i <800 ; i++) {
            nums[i]=nums[i%10]+nums[i/10];//递推
        }
        dfs(1,0,nums,n,arr);
        System.out.println(count);

    }

    public static void dfs(int x,int sum,int[]nums,int n,int []arr){
        if(sum>n){return;}
        if(x>3){
            if(arr[1]+arr[2]==arr[3]&&n==sum){
                count++;
            }
            return;
        }

        for (int i=0;i<=711;i++){
            arr[x]=i;
            dfs(x+1,sum+nums[i],nums,n,arr);
            arr[x]=0;
        }
    }

//    public static int col(int []nums,int i){
//        if(nums[i]>0){
//            return nums[i];
//        }
//        int num=0;
//        while(i>0){
//            num+=nums[i%10];
//            i=i/10;
//        }
//
//        return num;
//    }
}

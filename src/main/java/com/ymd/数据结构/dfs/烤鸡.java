package com.ymd.数据结构.dfs;

//自己 标记 目标
//P2089 luoGu
//有10种配料 每种配料1-3g 任意烤鸡的美味程度为所有配料之和
// 现在想要知道，给你一个美味程度n，输出这10种配料的搭配方案

import java.util.ArrayList;
import java.util.Scanner;

//输入：n
//输出：第一行为方案总数量  第二行到最后一行 10个数 按字典序列排列 如果没有则0  所有方案输出
public class 烤鸡 {
    static int counts=0;
    public static void main(String[] args) {
        //调料 10~30  n在这个之间  超出为0
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [][]mem=new int[59050][n+1];//所有方案
        int []nums=new int[n+1];  //是什么方案
        int sum=0;
        dfs(1,sum,n,nums,mem);
        System.out.println(counts);
        for (int i = 0; i <counts ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print(mem[i][j]);
            }
            System.out.println();
        }
    }


    //x表示 当前枚举到了哪一位 sum是当前已经选上了的和  因为每个都是无关的所以不需要start
    public static void dfs(int x,int sum,int n,int []nums,int [][]mem){
        if(sum>n){return;}
        if(x>10){
            if(sum==n){
                for (int i = 1; i <=10 ; i++) {
                    mem[counts][i]=nums[i];
                }
                counts++;
            }
            return;
        }
        for (int i = 1; i <=3 ; i++) {
            nums[x]=i;
            dfs(x+1,sum+i,n,nums,mem);  //注意是这里＋sum   而不是sum+=nums[x];
            nums[x]=0;
        }
    }


}

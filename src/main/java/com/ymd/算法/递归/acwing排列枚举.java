package com.ymd.算法.递归;


//把 1∼n
// 这 n
// 个整数排成一行后随机打乱顺序，输出所有可能的次序。
//
//输入格式
//一个整数 n
//。
//
//输出格式
//按照从小到大的顺序输出所有方案，每行 1
// 个。
//
//首先，同一行相邻两个数用一个空格隔开。
//
//其次，对于两个不同的行，对应下标的数一一比较，字典序较小的排在前面。


import java.util.Scanner;

// ★就是字典排序
public class acwing排列枚举 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean[] label = new boolean[n + 1];   //存i有没有被用过
        int []nums=new int[n+1];

        dfs(1, n, label,nums);


    }

    public static void dfs(int x, int n, boolean[] label, int[] nums) {
        if(x>n){
            for (int i = 1; i <=n; i++) {
                System.out.print(nums[i]);
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!label[i]) {
                label[i]=true;
                nums[x]=i;
                dfs(x+1,n,label,nums);
                label[i]=false;
                nums[x]=0;
            }
        }

    }
}

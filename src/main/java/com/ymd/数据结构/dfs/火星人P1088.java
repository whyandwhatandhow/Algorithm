package com.ymd.数据结构.dfs;

import java.util.Scanner;

//可以从火星人给的数据开始枚举

public class 火星人P1088 {
    static int counts = 0;
    static boolean return0=false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//手指数
        int m = scanner.nextInt();//加数


        int[] nums = new int[n + 1];//方案数
        int[] start = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            start[i] = scanner.nextInt();
        }

        boolean[] label = new boolean[n + 1];
        dfs(1, n, m, start, nums, label);
    }

    public static void dfs(int x, int n, int m, int[] start, int[] nums, boolean[] label) {
        if(return0){
            return;
        }
        if (x > n) {
            counts++;
            if (counts == m + 1) {
                return0=true;
                for (int i = 1; i <=n ; i++) {
                    System.out.print(nums[i]+" ");
                }
                System.out.println();
            }
            return;
        }

        for (int i = 1; i <= n; i++) {
            if(counts==0){
                i=start[x];
            }
            if (!label[i]) {
                label[i] = true;
                nums[x] = i;
                dfs(x + 1, n, m, start, nums, label);
                label[i] = false;
                nums[x] = 0;
            }
        }
    }


}

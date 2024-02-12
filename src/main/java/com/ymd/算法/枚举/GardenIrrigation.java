package com.ymd.算法.枚举;

import java.util.Scanner;

//小蓝负责花园的灌溉工作
//花园可以看成一个n行m列的方格图形。中间有一部分位置上安装有出水管小蓝可以控制一个按钮同时打开所有的出水管，打开时，有出水管的位置可以被认为已经灌溉好。
//每经过一分钟，水就会向四面扩展一个方格，被扩展到的方格可以被认为已经灌溉好。即如果前一分钟某一个方格被灌溉好，则下一分钟它上下左右的四个方格也被灌溉好
//给定花园水管的位置，请问  分钟后，有多少个方格被灌溉好?
//输入描述
//输入的第一行包含两个整数n,m。
//第二行包含一个整数t，表示出水管的数量
//接下来t行描述出水管的位置，其中第行包含两个数r,c表示第下行第c列有一个排水管。
//接下来一行包含一个整数k。
//其中，1<n,m<100,1<t< 10,1<k<100.
public class GardenIrrigation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入花园的行数和列数
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 初始化花园
        int[][] garden = new int[n][m];

        // 输入排水管的数量
        int t = scanner.nextInt();

        // 输入排水管的位置
        for (int i = 0; i < t; i++) {
            int r = scanner.nextInt() - 1;
            int c = scanner.nextInt() - 1;
            // 标记排水管的位置
            garden[r][c] = 1;
        }

        // 输入按下按钮的次数
        int k = scanner.nextInt();

        // 模拟灌溉过程
        for (int step = 0; step < k; step++) {
            int[][] tempGarden = new int[n][m];

            // 遍历原始花园
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (garden[i][j] == 1) {
                        // 如果当前位置有水管，将上下左右四个方格标记为已灌溉
                        if (i - 1 >= 0) tempGarden[i - 1][j] = 1;
                        if (i + 1 < n) tempGarden[i + 1][j] = 1;
                        if (j - 1 >= 0) tempGarden[i][j - 1] = 1;
                        if (j + 1 < m) tempGarden[i][j + 1] = 1;
                        tempGarden[i][j] = 1;  // 当前位置也已灌溉
                    }
                }
            }

            // 更新花园状态
            garden = tempGarden;
        }

        // 统计被灌溉好的方格数量
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (garden[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}

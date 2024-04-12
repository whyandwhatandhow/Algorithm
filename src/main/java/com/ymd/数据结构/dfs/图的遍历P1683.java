package com.ymd.数据结构.dfs;

import java.util.Scanner;

public class 图的遍历P1683 {
    static int count = 0;
    static int[] dex = {-1, 0, 1, 0};
    static int[] dey = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt(); //有多少列
        int H = scanner.nextInt();  //有多少行
        scanner.nextLine();
        char[][] tu = new char[H][W];
        boolean[][] label = new boolean[H][W];

        for (int i = 0; i < H; i++) {
            String line=scanner.nextLine();
            tu[i]=line.toCharArray();
        }

        for (int i = 0; i <H ; i++) {
            for (int j = 0; j < W; j++) {
                if(tu[i][j]=='@'){
                    dfs(i,j,H,W,label,tu);
                }
            }
        }

        count++;
        System.out.println(count);

    }

    public static void dfs(int h, int w, int H, int W, boolean[][] label,char[][]tu) {
        for (int i = 0; i < 4; i++) {
            int a = h + dex[i];
            int b = w + dey[i];
            if (a < 0 || a >= H || b < 0 || b >= W) {
                continue;
            }
            if(tu[a][b]!='.'){
                continue;
            }
            if(label[a][b])continue;

            label[a][b]=true;
            count++;
            dfs(a,b,H,W,label,tu);

        }
    }

}

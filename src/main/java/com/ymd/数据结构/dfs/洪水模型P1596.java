package com.ymd.数据结构.dfs;

import java.util.Scanner;

public class 洪水模型P1596 {//有几块联通
    static int count = 0;

    static int[] dex = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dey = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] tu = new char[n][m];
        boolean[][]label=new boolean[n][m];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            tu[i] = s.toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(tu[i][j]=='W'&&!label[i][j]){
                    dfs(i,j,n,m,tu,label);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void dfs(int x,int y,int n,int m,char[][]tu,boolean[][]label){

        for (int i = 0; i < 8; i++) {
            int a=x+dex[i];
            int b=y+dey[i];
            if(a<0||b<0||a>=n||b>=m){
                continue;
            }
            if(tu[a][b]!='W'){
                continue;
            }
            if(label[a][b]){
                continue;
            }
            label[a][b]=true;
            dfs(a,b,n,m,tu,label);
        }

    }
}
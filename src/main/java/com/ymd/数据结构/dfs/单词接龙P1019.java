package com.ymd.数据结构.dfs;

import java.util.Scanner;

public class 单词接龙P1019 {
    static int count=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        String[]words=new String[n];
        int []used=new int[n];//每个单词可以使用两次
        for (int i = 0; i <n ; i++) {
            words[i]=scanner.nextLine();
        }



    }
}

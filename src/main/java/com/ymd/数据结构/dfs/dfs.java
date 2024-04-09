package com.ymd.数据结构.dfs;

import java.util.Scanner;


//大概就是一个图，看图内两个点是否联通
public class dfs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        scanner.nextLine();
        char [][] graph=new char[N][N];
        for (int i = 0; i < N; i++) {
            graph[i]=scanner.nextLine().toCharArray();
        }

        int M=scanner.nextInt();
        int [][]query=new int[M][4];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 4; j++) {
                query[i][j]=scanner.nextInt();
            }
        }

        //★
        for (int i = 0; i < M; i++) {
            boolean ok=check(graph,new int[N][N],query[i]);
            System.out.println(ok);
        }

    }


    //需要三个参数，图，标记位，目标位
    public static boolean check(char[][]graph,int[][] label,int[]points){
        int x1=points[0];
        int y1=points[1];
        int x2=points[2];
        int y2=points[3];
        //这几个点的横纵坐标,x1y1动去找x2y2


        //这两个点通过递归是否相遇
        if(x1==x2&&y1==y2){
            return true;
        }


        int value=graph[x1][y1];
        boolean f1=false;
        boolean f2=false;
        boolean f3=false;
        boolean f4=false;
        //左走，不能走出去，没被访问过，左边位置的值和目前位置相同，也就是联通
        if(x1-1>=0&&label[x1-1][y1]==0&&graph[x1-1][y1]==value){
            label[x1-1][y1]=1;//左边已被访问
            points[0]=x1-1;//左边作为起点
            f1=check(graph,label,points);

            //下一个的左边不一定被访问了
            label[x1-1][y1]=0;
            points[0]=x1;
        }

        //右
        if(x1+1<graph.length&&label[x1+1][y1]==0&&graph[x1+1][y1]==value){
            label[x1+1][y1]=1;//左边已被访问
            points[0]=x1+1;//左边作为起点
            f2=check(graph,label,points);

            //下一个的左边不一定被访问了   叫回溯
            label[x1+1][y1]=0;
            points[0]=x1;
        }


        if(y1-1>=0&&label[x1][y1-1]==0&&graph[x1][y1-1]==value){
            label[x1][y1-1]=1;//左边已被访问
            points[1]=y1-1;//左边作为起点
            f3=check(graph,label,points);

            //下一个的左边不一定被访问了
            label[x1][y1-1]=0;
            points[1]=y1;
        }


        if(y1+1<graph.length&&label[x1][y1+1]==0&&graph[x1][y1+1]==value){
            label[x1][y1+1]=1;//左边已被访问
            points[1]=y1+1;//左边作为起点
            f4=check(graph,label,points);

            //下一个的左边不一定被访问了
            label[x1][y1+1]=0;
            points[1]=y1;
        }

        return f1||f2||f3||f4;
    }
}

package com.ymd.数据结构.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 染色圈问题P1162 {
    public static class Coordinate{
        private int x;
        private int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
    //标记需要被染色的点
    public static void main(String[] args) {//让数组更大，从00开始搜索 //将外面的都标记为false
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][]tu=new int[n+10][n+10];
        scanner.nextLine();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                tu[i][j]=scanner.nextInt();
            }
        }

        boolean [][]label=new boolean[n+10][n+10];

        bfs(0,0,n,tu,label);
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(!label[i][j]&&tu[i][j]==0){
                    tu[i][j]=2;
                }
            }
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(tu[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[]dex={-1,0,1,0};
    static int[]dey={0,1,0,-1};

    public static void bfs(int x,int y,int n,int[][]tu,boolean[][]label){
        Queue<Coordinate>queue=new LinkedList<>();
        queue.offer(new Coordinate(x,y));
        while(!queue.isEmpty()){
            Coordinate b=queue.poll();
            for (int i = 0; i < 4; i++) {
                int numX=b.getX()+dex[i];
                int numY=b.getY()+dey[i];
                if(numX<0||numY<0||numX>n+1||numY>n+1)continue;   //注意是小于0 大于n+1把所有边界都扩大一个
                if(tu[numX][numY]==1)continue;
                if(label[numX][numY])continue;
                label[numX][numY]=true;
                queue.offer(new  Coordinate(numX,numY));
            }
        }
    }
}

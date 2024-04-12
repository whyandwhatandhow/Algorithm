package com.ymd.数据结构.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 瘟疫扩散P1322 {//同时扩散问题
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
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        scanner.nextLine();
        Coordinate []gui=new Coordinate[a];//鬼
        int [][]dist=new int[n+1][m+1];
        Queue<Coordinate>queue=new LinkedList<>();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                dist[i][j]=-1;
            }
        }
        for (int i = 0; i < a; i++) {
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            dist[x][y]=0;
            gui[i]=new Coordinate(x,y);
            queue.offer(gui[i]);
        }
        scanner.nextLine();
        for (int i = 0; i < b; i++) {
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            System.out.println(bfs(x,y,n,m,dist,queue));
        }


    }

    static int[]dex={-1,0,1,0};
    static int[]dey={0,1,0,-1};
    public static int bfs(int x,int y,int n,int m,int [][]dist,Queue<Coordinate>queue){

        while(!queue.isEmpty()){
            Coordinate b=queue.poll();
            for (int j=0;j<4;j++){
                int numX=b.getX()+dex[j];
                int numY=b.getY()+dey[j];
                if(numX<1||numY<1||numX>n||numY>m)continue;
                if(dist[numX][numY]>=0)continue;
                queue.offer(new Coordinate(numX,numY));
                dist[numX][numY]=dist[b.getX()][b.getY()]+1;
            }
        }

        return dist[x][y];
    }
}

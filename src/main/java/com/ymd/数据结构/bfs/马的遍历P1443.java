package com.ymd.数据结构.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 马的遍历P1443 {//马走日
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
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int[][]dist=new int[n+1][m+1];

        bfs(n,m,x,y,dist);

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                System.out.print(dist[i][j]+" ");
            }
            System.out.println();
        }

    }

    static int []dex={-2,-1,1,2,2,1,-1,-2};
    static int []dey={1,2,2,1,-1,-2,-2,-1};
    public static void bfs(int n,int m,int x,int y,int [][]dist){
        Queue<Coordinate>queue=new LinkedList<>();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                dist[i][j]=-1;
            }
        }
        dist[x][y]=0;
        queue.offer(new Coordinate(x,y));
        while(!queue.isEmpty()){
            Coordinate b=queue.poll();
            for (int i = 0; i < 8; i++) {
                int numX=b.getX()+dex[i];
                int numY=b.getY()+dey[i];
                if(numY<1||numX<1||numX>n||numY>m)continue;
                if(dist[numX][numY]>=0)continue;
                queue.offer(new Coordinate(numX,numY));
                dist[numX][numY]=dist[b.getX()][b.getY()]+1;
            }
        }
    }



}

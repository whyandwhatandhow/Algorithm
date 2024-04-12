package com.ymd.数据结构.bfs;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//从起点走到终点的最短路
//1代表墙 0代表路
//5 5
//0 1 0 0 0
//0 1 0 1 0
//0 0 0 0 0
//0 1 1 1 0
//0 0 0 1 0
public class 走迷宫acwing {


    //将需要入队的坐标初始下
    static class Coordinate{
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

    static int[]dex={-1,0,1,0};
    static int []dey={0,1,0,-1};
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//row
        int m=scanner.nextInt();//col
        int [][]tu=new int [n][m];
        int [][]dist=new int[n][m];



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tu[i][j]=scanner.nextInt();
            }
        }

        int num=bfs(0,0,tu,dist,n,m);//从0开始到终点
        System.out.println(num);
    }

    public static int bfs(int x,int y,int[][]tu,int[][]dist,int n,int m){
        Queue<Coordinate>queue=new LinkedList<>();
        //初始化距离都为-1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dist[i][j]=-1;
            }
        }
        Coordinate a=new Coordinate(x,y);
        queue.offer(a);
        dist[x][y]=0;
        while(!queue.isEmpty()){
            Coordinate b= queue.poll();
            for (int i = 0; i < 4; i++) {
                int numX=b.getX()+dex[i];
                int numY=b.getY()+dey[i];
                if(numX<0||numX>=n||numY<0||numY>=m)continue;
                if(tu[numX][numY]!=0)continue;
                if(dist[numX][numY]>0)continue;  //表示已经遍历过了

                queue.offer(new Coordinate(numX,numY));
                dist[numX][numY]=dist[b.getX()][b.getY()]+1;
            }
        }
        return dist[n-1][m-1];
    }


}
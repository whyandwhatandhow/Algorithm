package com.ymd.数据结构.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 找店铺P1746 {
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
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // 读取换行符

        char[][] tu = new char[n + 1][n + 1];

        // 将第一行和第一列都设置为 '0'
        for (int i = 0; i <= n; i++) {
            tu[0][i] = '0';  // 第一行
            tu[i][0] = '0';  // 第一列
        }

        // 读取迷宫数据
        for (int i = 1; i <= n; i++) {
            String s ="0"+scanner.nextLine();
            tu[i] = s.toCharArray();
        }
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();

        int num=bfs(n,tu,x1,y1,x2,y2);
        System.out.println(num);
    }

    static int[]dex={-1,0,1,0};
    static int[]dey={0,1,0,-1};

    public static int bfs(int n,char[][]tu,int x1,int y1,int x2,int y2){
        Queue<Coordinate>queue=new LinkedList<>();
        int[][]dist=new int[n+1][n+1];
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                dist[i][j]=-1;
            }
        }
        dist[x1][y1]=0;
        queue.add(new Coordinate(x1,y1));
        while(!queue.isEmpty()){
            Coordinate b=queue.poll();
            for (int i = 0; i < 4; i++) {
                int numX=b.getX()+dex[i];
                int numY=b.getY()+dey[i];
                if(numY<1||numX<1||numX>n||numY>n)continue;
                if(tu[numX][numY]!='0')continue;
                if(dist[numX][numY]>0)continue;

                queue.offer(new Coordinate(numX,numY));
                dist[numX][numY]=dist[b.getX()][b.getY()]+1;
            }
        }
        return dist[x2][y2];
    }
}

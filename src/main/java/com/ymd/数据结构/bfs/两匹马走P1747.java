package com.ymd.数据结构.bfs;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class 两匹马走P1747 {
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
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();

        int num1=bfs(x1,y1);
        int num2=bfs(x2,y2);
        System.out.println(num1);
        System.out.println(num2);
    }


    static int[]dex={-2,-2,-1,1,2,2,2,2,1,-1,-2,-2};
    static int[]dey={1,2,2,2,2,1,-1,-2,-2,-2,-2,-1};
    public static int bfs(int x,int y){
        Queue<Coordinate>queue=new LinkedList<>();
        int [][]dist=new int[110][110];
        for (int i = 1; i <=100 ; i++) {
            for (int j = 1; j <=100 ; j++) {
                dist[i][j]=-1;
            }
        }

        queue.offer(new Coordinate(x,y));
        dist[x][y]=0;
        while(!queue.isEmpty()) {
            Coordinate b = queue.poll();
            for (int i = 0; i < 12; i++) {
                int numX=b.getX()+dex[i];
                int numY=b.getY()+dey[i];
                if(numY<1||numX<1||numX>100||numY>100)continue;
                if(dist[numX][numY]>=0)continue;
                queue.offer(new Coordinate(numX,numY));
                dist[numX][numY]=dist[b.getX()][b.getY()]+1;
            }
        }
        return dist[1][1];
    }
}

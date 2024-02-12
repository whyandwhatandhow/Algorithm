package com.ymd.数据结构.线性结构;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 队列的运用 {
    public static void main(String[] args) {
        Queue<Integer> que=new LinkedList<>();
        boolean[] hashable=new boolean[1003];//判断是否在内存
        Scanner scanner=new Scanner(System.in);

        int m,n;
        m=scanner.nextInt();
        n=scanner.nextInt();

        int count=0;

        for(int i=0;i<n;i++){
            int x=scanner.nextInt();
            if(!hashable[x]){
                hashable[x]=true;
                if(que.size()<m){
                    que.offer(x);
                }else {
                    hashable[que.poll()]=false;
                    que.offer(x);
                }
                count++;
            }
        }

        System.out.println(count);
    }
}

package com.ymd.数据结构.线性结构;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class 双端队列 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Deque<Integer> que=new LinkedList<>();
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int op=scanner.nextInt();
            if(op==2){
                que.pollFirst();
            }if(op==3){
                System.out.println(que.peekFirst()+" "+que.peekLast());
            } else if (op==1) {
                int x=scanner.nextInt();
                que.offerLast(x);
            }
        }
    }
}

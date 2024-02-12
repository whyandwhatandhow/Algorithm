package com.ymd.数据结构.线性结构;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 队列和字符串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queNormal = new LinkedList<>();
        Queue<String> queVIP = new LinkedList<>();

        int n = scanner.nextInt();
        scanner.nextLine(); // 消耗掉输入中的换行符

        for (int i = 0; i < n; i++) {
            String op = scanner.nextLine();
            int INIndex = op.indexOf("IN");
            int endIndex = op.length();

            if (INIndex != -1) {
                if (op.charAt(op.length() - 1) == 'V') {
                    String x = op.substring(INIndex + 3, endIndex - 1);
                    queVIP.add(x);
                } else if (op.charAt(op.length() - 1) == 'N') {
                    String x = op.substring(INIndex + 3, endIndex - 1);
                    queNormal.add(x);
                }
            }

            if (op.contains("OUT")) {
                if (op.charAt(op.length() - 1) == 'V') {
                    queVIP.poll();
                } else if (op.charAt(op.length() - 1) == 'N') {
                    queNormal.poll();
                }
            }
        }

        // 输出VIP队列中的元素  因为队列元素是在改变的所以用isEmpty
        while (!queVIP.isEmpty()) {
            System.out.println(queVIP.poll());
        }

        // 输出普通队列中的元素
        while (!queNormal.isEmpty()) {
            System.out.println(queNormal.poll());
        }
    }
}

package com.ymd;

import java.util.*;

public class Test {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }

    public static int sumNumbers(TreeNode root) {
        Queue<Integer>queue=new LinkedList<>();
        int sum=0;
        TreeNode s=root;
        dfs(s,queue,sum);
        return sum;
    }

    public static void dfs(TreeNode root,Queue<Integer>queue,int sum){
        if(root==null){
            int num=0;
            while(!queue.isEmpty()){
                num+= queue.poll();
                num=num*10;
            }
            sum+=num;
            System.out.println(sum);
            return;
        }

        queue.add(root.val);
        dfs(root.left,queue,sum);
        queue.poll();

        queue.add(root.val);
        dfs(root.right,queue,sum);
        queue.poll();
    }



}

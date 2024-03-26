package com.ymd;

import java.math.BigInteger;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
         root.left=new TreeNode(2);
         root.right=new TreeNode(7);

    }

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



    public boolean isContain(int n){
        String s= String.valueOf(n);
        return !s.contains("2") && !s.contains("3") && !s.contains("4") && !s.contains("5") && !s.contains("6") && !s.contains("7") && !s.contains("8") && !s.contains("9");
    }

}
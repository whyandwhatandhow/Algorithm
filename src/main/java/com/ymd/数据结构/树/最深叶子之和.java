package com.ymd.数据结构.树;

import com.ymd.Main;

public class 最深叶子之和 {
    public static class TreeNode {
        int val;
        Main.TreeNode left;
        Main.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, Main.TreeNode left, Main.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    int sum=0;
    int maxL=0;
    public int deepestLeavesSum(Main.TreeNode root) {
        dfs(root,0);
        return sum;
    }

    public void dfs(Main.TreeNode root, int level){
        if(root==null)
            return;

        if(level>maxL){
            maxL=level;
            sum=root.val;
        }else if(level==maxL){
            sum+= root.val;
        }

        dfs(root.left,level+1);
        dfs(root.right,level+1);
    }

}

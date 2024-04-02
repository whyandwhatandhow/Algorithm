package com.ymd.数据结构.树;

import com.ymd.Main;
import com.ymd.Test;

public class 最深叶子之和 {
    public static class TreeNode {
        int val;
        Test.TreeNode left;
        Test.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, Test.TreeNode left, Test.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    int sum=0;
    int maxL=0;
    public int deepestLeavesSum(Test.TreeNode root) {
        dfs(root,0);
        return sum;
    }

    public void dfs(Test.TreeNode root, int level){
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

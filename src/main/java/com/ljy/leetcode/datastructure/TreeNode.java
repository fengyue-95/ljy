package com.ljy.leetcode.datastructure;

/**
 * @author fengyue
 * @date 2021/6/23
 */
public class TreeNode {

    int      val;
    TreeNode left;
    TreeNode right;

    TreeNode(){
    }

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}

package com.ljy.leetcode.num51to100;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/**
 * @author fengyue
 * @date 2021/5/22
 *
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 * 示例 1：
 * 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 *
 * 示例 2：
 * 输入：root = []
 * 输出：[]
 *
 * 示例 3：
 * 输入：root = [1]
 * 输出：[1]
 *
 * 二叉树前序【根左右】，中序【左根右】，后序【左右根】
 *
 * 前中后序迭代通用模版，重点是把值也入栈。由于栈先进后出，因此：
 * 前序：根左右 -> 右左根
 * 中序：左根右 -> 右根左
 * 后序：左右根 -> 根右左
 * 遇到不同顺序的题目，只要把其中三行代码按照不同顺序替换即可：
 */
public class Leetcode94 {

    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur=root;
        while(cur !=null || !stack.isEmpty()){
            if(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }else{
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
        return list;

    }

    class TreeNode{
        Integer val;
        TreeNode left;
        TreeNode right;
    }
}

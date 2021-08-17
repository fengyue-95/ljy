package com.ljy.leetcode.num101to150;

import java.util.LinkedList;
import java.util.Queue;

import com.ljy.leetcode.datastructure.TreeNode;

/**
 * @author fengyue
 * @date 2021/6/23 给定一个二叉树，找出其最小深度。 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。 说明：叶子节点是指没有子节点的节点。   示例 1： 输入：root =
 * [3,9,20,null,null,15,7] 输出：2 示例 2： 输入：root = [2,null,3,null,4,null,5,null,6] 输出：5 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-depth-of-binary-tree 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leetcode111 {

    public static void main(String[] args) {
    }

    // public int minDepth(TreeNode root) {
    // if (null == root) {
    // return 0;
    // }
    //
    // Queue<TreeNode> q = new LinkedList<>();
    // //将根节点添加到队列
    // q.offer(root);
    // //从根节点开始算1
    // int depth = 1;
    //
    // while (!q.isEmpty()) {
    // int size = q.size();
    // for (int i = 0; i < size; i++) {
    //
    // TreeNode current = q.poll();
    // //判断左右孩子节点都为空，代表遍历结束
    // if (null == current.getRight() && null == current.getLeft()) {
    // return depth;
    // }
    //
    // //否则将左右孩子节点加入到队列，作为下一次的current节点，继续判断左右孩子节点
    // if (null != current.getLeft()) {
    // q.offer(current.getLeft());
    // }
    // if (null != current.getRight()) {
    // q.offer(current.getRight());
    // }
    //
    // }
    // depth++;
    // }
    // return depth;
    // }

    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        // treeNode为根节点，将根节点加入队列
        queue.offer(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            // sz为每次节点的孩子数
            int sz = queue.size();
            //
            for (int i = 0; i < sz; i++) {
                // 移出当前节点
                TreeNode current = queue.poll();
                if (current.getRight() == null && current.getLeft() == null) {
                    return depth;
                }

                if (root.getLeft() != null) {
                    queue.offer(root.getLeft());
                }
                if (root.getRight() != null) {
                    queue.offer(root.getRight());
                }

            }
            depth++;
        }
        return depth;
    }

}

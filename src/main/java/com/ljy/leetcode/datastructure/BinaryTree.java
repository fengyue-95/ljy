package com.ljy.leetcode.datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author fengyue
 * @date 2021/6/22
 * 二叉树的前序（左根右），中序（根左右），后序（左右根），层序遍历
 */
public class BinaryTree {

    public static Node init() {
        // 注意必须逆序建立，先建立子节点，再逆序往上建立，因为非叶子结点会使用到下面的节点，而初始化是按顺序初始化的，不逆序建立会报错
        Node J = new Node(8, null, null);
        Node H = new Node(4, null, null);
        Node G = new Node(2, null, null);
        Node F = new Node(7, null, J);
        Node E = new Node(5, H, null);
        Node D = new Node(1, null, G);
        Node C = new Node(9, F, null);
        Node B = new Node(3, D, E);
        Node A = new Node(6, B, C);
        // 返回根节点
        return A;
    }

    public static void printNode(Node node) {
        System.out.print(node.getData());
    }

    /**
     * 前序遍历
     * 
     * @param node
     */
    public static void preorder(Node node) {
        if (null != node) {
            printNode(node);
            if (null != node.getLeft()) {
                preorder(node.getLeft());
            }
            if (null != node.getRight()) {
                preorder(node.getRight());
            }
        }
    }

    /**
     * 中序遍历
     * 
     * @param node
     */
    public static void inorder(Node node) {
        if (null != node.getLeft()) {
            inorder(node.getLeft());
        }
        printNode(node);

        if (null != node.getRight()) {
            inorder(node.getRight());
        }

    }

    /**
     * 后序遍历
     * 
     * @param node
     */
    public static void postorder(Node node) {
        if (null != node.getLeft()) {
            postorder(node.getLeft());
        }
        if (null != node.getRight()) {
            postorder(node.getRight());
        }
        printNode(node);
    }


    /**
     * 层级遍历
     *
     * @param node
     */
    public static void levelorder(Node node) {
        if (node == null) {
            return;
        }

        int depth = depth(node);

        for (int i = 1; i <= depth; i++) {
            levelOrder(node, i);
        }
    }


    private static void levelOrder(Node node, int level) {
        if (node == null || level < 1) {
            return;
        }

        if (level == 1) {
            printNode(node);
            return;
        }

        // 左子树
        levelOrder(node.getLeft(), level - 1);

        // 右子树
        levelOrder(node.getRight(), level - 1);
    }

    public static int depth(Node node) {
        if (node == null) {
            return 0;
        }

        int l = depth(node.getLeft());
        int r = depth(node.getRight());
        if (l > r) {
            return l + 1;
        } else {
            return r + 1;
        }
    }

    //=========================================非递归==================================
    /**
     * 前序遍历
     * 非递归
     */
    public static void preOrder1(Node node)
    {
        Stack<Node> stack = new Stack<>();
        while(node != null || !stack.empty())
        {
            while(node != null)
            {
                printNode(node);
                stack.push(node);
                node = node.getLeft();
            }
            if(!stack.empty())
            {
                node = stack.pop();
                node = node.getRight();
            }
        }
    }

    /**
     * 中序遍历
     * 非递归
     */
    public static void inOrder1(Node root)
    {
        Stack<Node> stack = new Stack<Node>();
        Node node = root;
        while (node != null || stack.size() > 0) {
            if (node != null) {
                stack.push(node);   //直接压栈
                node = node.getLeft();
            } else {
                node = stack.pop(); //出栈并访问
                printNode(node);
                node = node.getRight();
            }
        }
    }

    /**
     * 后序遍历
     * 非递归
     */
    public static void postOrder1(Node root)
    {
        Stack<Node> stack = new Stack<Node>();
        Stack<Node> output = new Stack<Node>();//构造一个中间栈来存储逆后序遍历的结果
        Node node = root;
        while (node != null || stack.size() > 0) {
            if (node != null) {
                output.push(node);
                stack.push(node);
                node = node.getRight();
            } else {
                node = stack.pop();
                node = node.getLeft();
            }
        }
        while (output.size() > 0) {
            printNode(output.pop());
        }
    }

    /*
     * 层序遍历
     * 非递归
     */
    public static void levelOrder1(Node node) {
        if (node == null) {
            return;
        }

        Node binaryNode;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (queue.size() != 0) {
            binaryNode = queue.poll();

           printNode(binaryNode);

            if (binaryNode.getLeft() != null) {
                queue.offer(binaryNode.getLeft());
            }
            if (binaryNode.getRight() != null) {
                queue.offer(binaryNode.getRight());
            }
        }
    }


    public static void main(String[] args) {
        Node init = init();
        //preorder(init); //631254978
        //preOrder1(init);//631254978

        //inorder(init); //123456789
        //inOrder1(init);//123456789

        //postorder(init); //214538796
        //postOrder1(init);//214538796

        //levelorder(init); //639157248
        //levelOrder1(init);//639157248
    }

}

package com.ljy.leetcode.datastructure;

/**
 * @author fengyue
 * @date 2021/6/22
 */
public class Node {

    private int  data;
    private Node left;
    private Node right;

    public Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

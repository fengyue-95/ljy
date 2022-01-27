package com.ljy.wangzheng;

public class ArrayStack {

    private int[] items;

    private int count; //栈中的元素个数

    private int size; //栈的总大小

    public ArrayStack(int size) {
        this.items = new int[size];
        this.size = size;
        this.count = 0;
    }


    public boolean push(int value) {
        if (count == size) {
            return false;
        }
        items[count] = value;
        ++count;
        return true;
    }

    public int pop(){
        if (items.length == 0) {
            return 0;
        }
        int tmp=items[count--];
        --count;
        return tmp;
    }

}

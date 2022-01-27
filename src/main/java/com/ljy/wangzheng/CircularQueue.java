package com.ljy.wangzheng;

/**
 * @author fengyue
 * @date 2022/1/27
 */
public class CircularQueue {

    private  String[] queue;

    private  int      size;

    private int      head;

    private int      tail;

    public CircularQueue(int size){
        this.queue = new String[size];
        this.size = size;
        this.head = 0;
        this.tail = 0;
    }

    public boolean push(String value) {
        if ((tail + 1) % size == head) {
            return false;
        }
        queue[tail] = value;
        tail = (tail + 1) % size;
        return true;

    }

    public String pop() {
        if (head == tail) {
            return null;
        }
        String tmp = queue[head];

        head = (head + 1) % size;
        return tmp;
    }
}

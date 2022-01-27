package com.ljy.wangzheng;

/**
 * @author fengyue
 * @date 2022/1/27
 */
public class ArrayQueue {

    private String[] queue;

    private final int      size;

    private int      head; // 头部指针

    private int      tail; // 尾部指针

    public ArrayQueue(int size){
        queue = new String[size];
        this.size = size;
        head = 0;
        tail = 0;
    }

    public boolean push(String value) {
        // 队列满
        if (tail == size) {
            if (head == 0) {
                // 扩容前判断下 队列长度 避免过长
                if (queue.length > 1000) {
                    throw new RuntimeException("queue too long");
                }
                // 说明 整个队列是满的 新建一个长度是两倍的数组。copy数据
                String[] newqueue = new String[size * 2];
                for (int i = head; i < tail; i++) {
                    newqueue[i - head] = queue[i];
                }
                // 重制head ,tail
                tail = head--;
                head = 0;
                // 重新赋值给成员变量
                queue = newqueue;

            } else {
                for (int i = head; i < tail; i++) {
                    queue[i - head] = queue[i];
                }
                // 重制head ,tail
                tail = head--;
                head = 0;
            }
        }
        queue[tail] = value;
        ++tail;
        return true;
    }

    public String pop() {
        if (head == tail) {
            return null;
        }
        String tmp = queue[head];
        ++head;
        return tmp;
    }

}

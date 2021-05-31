package com.ljy.java.lru;

import java.util.HashMap;

/**
 * @author fengyue
 * @date 2021/5/31
 */
public class LRUCacheTest<K, V> {

    class Node<K, V> {

        K          key;
        V          value;
        Node<K, V> prve;
        Node<K, V> next;

        public Node(){

        }

        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    private final int                    capacity;
    private final Node<K, V>             head;
    private final Node<K, V>             tail;

    private final HashMap<K, Node<K, V>> map;

    public LRUCacheTest(int capacity){
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        head = new Node<>();
        tail = new Node<>();

        head.next = tail;
        tail.prve = head;
    }

    public V get(K key) {
        Node<K, V> node = map.get(key);
        if (null == node) {
            return null;
        }
        addToHead(node);
        return node.value;
    }

    public void put(K key, V value) {
        Node<K, V> node = map.get(key);
        if (null == node) {
            // 说明没有这个对象，此时需要判断容量
            if (map.size() >= capacity) {
                // 移除最后一个
                removeTailNode();
            }
            node = new Node<>(key, value);
            map.put(key, node);
            addToHead(node);

        }else{
            node.value = value;
            moveNodeToHead(node);
        }

    }

    private void removeNode(Node<K, V> node) {
        node.prve.next = node.next;
        node.next.prve = node.prve;
    }

    private void removeTailNode() {
        removeNode(tail.prve);
    }

    private void addToHead(Node<K, V> node) {
        node.prve = head;
        node.next = head.next;
        head.next.prve = node;
        head.next = node;
    }

    private void moveNodeToHead(Node<K, V> node) {
        removeNode(node);
        addToHead(node);
    }

}

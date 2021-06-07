package com.ljy.java.lru;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * @author fengyue
 * @date 2021/6/7
 */
public class LRUCacheLinkedHashMap<K, V> extends LinkedHashMap<K, V> {

    private final int CACHE_SIZE;

    public LRUCacheLinkedHashMap(int initialCapacity){
        super((int) Math.ceil(initialCapacity / 0.75) + 1, 0.75f, true);
        this.CACHE_SIZE = initialCapacity;
    }

    @Override
    protected boolean removeEldestEntry(Entry<K, V> eldest) {
        return size() > CACHE_SIZE;
    }
}

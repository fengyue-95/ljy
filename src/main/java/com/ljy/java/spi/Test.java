package com.ljy.java.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

import com.ljy.java.spi.service.Action;

/**
 * @author fengyue
 * @date 2021/5/28
 */
public class Test {
    public static void main(String[] args) {
        ServiceLoader<Action> serviceLoader = ServiceLoader.load(Action.class);
        Iterator<Action> iterator = serviceLoader.iterator();
        while (iterator.hasNext()){
            Action next = iterator.next();
            next.say();
        }
    }
}

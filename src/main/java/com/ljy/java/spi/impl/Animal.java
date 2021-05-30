package com.ljy.java.spi.impl;

import com.ljy.java.spi.service.Action;

/**
 * @author fengyue
 * @date 2021/5/28
 */
public class Animal implements Action {

    @Override
    public void say() {
        System.out.println("Animal说话了...不太可能");
    }
}

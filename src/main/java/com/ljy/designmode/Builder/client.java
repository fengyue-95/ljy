package com.ljy.designmode.Builder;

import sun.applet.Main;

/**
 * @author fengyue
 * @date 2021/11/8
 */
public class client {

    public static void main(String[] args) {
        Director director = new Director();
        BenzModel benzA = director.getBenzA();
        benzA.run();
    }
}

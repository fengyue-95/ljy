package com.ljy.designmode.Bridge;

/**
 * @author fengyue
 * @date 2021/11/11
 */
public class ClothesProduct extends Product {

    @Override
    void beProducted() {
        System.out.println("生产衣服");
    }

    @Override
    void beSelled() {
        System.out.println("卖衣服");
    }
}

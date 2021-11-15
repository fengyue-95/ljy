package com.ljy.designmode.Bridge;

/**
 * @author fengyue
 * @date 2021/11/11
 */
public class HouseProduct extends Product {

    @Override
    public void beProducted() {
        System.out.println("生产房子");
    }

    @Override
    public void beSelled() {
        System.out.println("卖房子");
    }
}

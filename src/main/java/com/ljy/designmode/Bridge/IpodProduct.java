package com.ljy.designmode.Bridge;

/**
 * @author fengyue
 * @date 2021/11/11
 */
public class IpodProduct extends Product {

    @Override
    public void beProducted() {
        System.out.println("生产ipod");
    }

    @Override
    public void beSelled() {
        System.out.println("卖ipod");
    }
}

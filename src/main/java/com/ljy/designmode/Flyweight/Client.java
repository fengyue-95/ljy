package com.ljy.designmode.Flyweight;

/**
 * @author fengyue
 * @date 2021/11/15
 *
 * 享元模式
 */
public class Client {
    public static void main(String[] args) {
        SignInfo signInfo = SignInfoFactory.getSignInfo("");
    }
}

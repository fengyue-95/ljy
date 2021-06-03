package com.ljy.designmode.Strategy;

/**
 * @author fengyue
 * @date 2021/6/3
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}

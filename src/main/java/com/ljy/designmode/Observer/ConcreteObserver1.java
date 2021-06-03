package com.ljy.designmode.Observer;

/**
 * @author fengyue
 * @date 2021/6/3
 */
public class ConcreteObserver1 implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}

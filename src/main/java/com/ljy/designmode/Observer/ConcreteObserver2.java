package com.ljy.designmode.Observer;

/**
 * @author fengyue
 * @date 2021/6/3
 */
public class ConcreteObserver2 implements Observer {

    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}

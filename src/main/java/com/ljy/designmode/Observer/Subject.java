package com.ljy.designmode.Observer;

import java.util.ArrayList;
import java.util.List;


/**
 * @author fengyue
 * @date 2021/6/3
 */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();

    // 增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }

    // 删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver(); // 通知观察者方法
}

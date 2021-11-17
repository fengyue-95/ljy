package com.ljy.designmode.Memento;

/**
 * @author fengyue
 * @date 2021/11/17
 *
 * 备忘录模式
 * 在不破坏封装性的前提下，捕获一个对象的内部状 态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。
 */
public class Client {

    public static void main(String[] args) {
        Boy boy = new Boy();
        //初始化当前状态
        boy.setState("init");
        System.out.println("====init==="+boy.getState()+"======");
        Memento memento = boy.createMemento();
        memento.setState(boy.getState());
        boy.changState();
        System.out.println("====change==="+boy.getState()+"======");

        boy.restoreMemento(memento);
        System.out.println("====final==="+boy.getState()+"======");

    }

}

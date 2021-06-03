package com.ljy.designmode.Single;

/**
 * @author fengyue
 * @date 2021/6/2
 */
public class SingletonObj {

    private volatile static SingletonObj instance;

    public SingletonObj(){
    }

    public static SingletonObj getInstance() {
        if (instance == null) {
            synchronized (SingletonObj.class) {
                if (instance == null) {

                    instance = new SingletonObj();
                }

            }
        }
        return instance;
    }

    // private enum SingleTonObject {
    //
    // INSTANCE;
    //
    // private final Singleton instance;
    //
    // SingleTonObject(){
    // instance = new Singleton();
    // }
    //
    // public Singleton getInstance() {
    // return instance;
    //
    // }
    // }
    //
    // public static Singleton getInstance(){
    // return SingleTonObject.INSTANCE.getInstance();
    // }
}

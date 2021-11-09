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


}

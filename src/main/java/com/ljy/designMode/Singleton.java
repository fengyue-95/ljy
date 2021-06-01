package com.ljy.designMode;

/**
 * @author fengyue
 * @date 2021/6/2
 */
public class Singleton {

    // private volatile static Singleton instance;

    public Singleton(){
    }

    // public static Singleton getInstance() {
    // if (instance == null) {
    // synchronized (Singleton.class) {
    // if (instance == null) {
    //
    // instance = new Singleton();
    // }
    //
    // }
    // }
    // return instance;
    // }

    private enum SingleTonObject {

                                  INSTANCE;

        private final Singleton instance;

        SingleTonObject(){
            instance = new Singleton();
        }

        public Singleton getInstance() {
            return instance;

        }
    }

    public static Singleton getInstance(){
        return SingleTonObject.INSTANCE.getInstance();
    }
}

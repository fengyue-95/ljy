package com.ljy.designmode.Template;

/**
 * @author fengyue
 * @date 2021/11/16
 */
public class Hm1Model extends HmModel {

    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    public  void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }
}

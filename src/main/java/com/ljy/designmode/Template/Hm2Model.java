package com.ljy.designmode.Template;

/**
 * @author fengyue
 * @date 2021/11/16
 */
public class Hm2Model extends HmModel {

    @Override
    public void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的...");
    }

}

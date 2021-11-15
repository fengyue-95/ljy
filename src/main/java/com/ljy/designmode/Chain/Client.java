package com.ljy.designmode.Chain;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class Client {

    public static void main(String[] args) {

        Random rand = new Random();
        ArrayList<Woman> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Woman(rand.nextInt(4), "我要出去逛街"));
        }

        //组成链
        Father father = new Father();
        Husband husband = new Husband();
        Son son = new Son();

        father.setNext(husband);
        husband.setNext(son);

        for (Woman w : arrayList) {
            father.Response(w);
        }

    }
}

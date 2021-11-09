package com.ljy.designmode.Builder;

import java.util.ArrayList;

/**
 * @author fengyue
 * @date 2021/11/8
 */
public class test {
    public static void main(String[] args) {
        BenzModel benz = new BenzModel();
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom"); //客户要求，run的时候先发动引擎
        sequence.add("start"); //启动起来
        sequence.add("stop"); //开了一段就停下来 //我们把这个顺序赋予奔驰车
        benz.setSequence(sequence);
        benz.run();
    }
}

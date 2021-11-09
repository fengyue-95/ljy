package com.ljy.designmode.AbstractFactory;

/**
 * @author fengyue
 * @date 2021/11/8
 */
public class test {
    public static void main(String[] args) {
        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleFactory();
        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();

        Human blackHuman = maleHumanFactory.createBlackHuman();
        Human yellowHuman = maleHumanFactory.createYellowHuman();

        Human blackHuman1 = femaleHumanFactory.createBlackHuman();
        Human yellowHuman1 = femaleHumanFactory.createYellowHuman();

        System.out.println();
    }

}

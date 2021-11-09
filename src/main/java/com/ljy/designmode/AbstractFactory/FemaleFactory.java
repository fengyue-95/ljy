package com.ljy.designmode.AbstractFactory;

/**
 * @author fengyue
 * @date 2021/11/8
 */
public class FemaleFactory implements HumanFactory {

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override public Human createYellowHuman() {
        return  new FemaleYellowHuman();
    }

}

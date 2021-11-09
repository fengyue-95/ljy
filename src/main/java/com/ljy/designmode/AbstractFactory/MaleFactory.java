package com.ljy.designmode.AbstractFactory;

/**
 * @author fengyue
 * @date 2021/11/8
 */
public class MaleFactory implements HumanFactory {

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}

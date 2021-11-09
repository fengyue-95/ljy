package com.ljy.designmode.Factory;

/**
 * @author fengyue
 * @date 2021/11/8
 */
public class BlackHumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> clazz) {
        return null;
    }
}

package com.ljy.designmode.Factory;

/**
 * @author fengyue
 * @date 2021/11/8
 */
public abstract class AbstractHumanFactory {
    /**
     * 创建
     * @param clazz
     * @param <T>
     * @return
     */
    public abstract <T extends Human> T createHuman(Class<T> clazz);
}

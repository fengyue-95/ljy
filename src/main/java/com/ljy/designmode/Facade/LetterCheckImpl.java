package com.ljy.designmode.Facade;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class LetterCheckImpl implements ILetterCheck{
    @Override public void letterCheck() {
        System.out.println("信件校验通过...");
    }
}

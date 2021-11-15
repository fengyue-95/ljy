package com.ljy.designmode.Facade;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class Client {

    public static void main(String[] args) {
        LetterFacade letterFacade = new LetterFacade();
        letterFacade.sendLetter("我爱你","南海中学");
    }
}

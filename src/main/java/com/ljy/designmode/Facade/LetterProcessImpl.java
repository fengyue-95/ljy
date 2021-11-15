package com.ljy.designmode.Facade;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class LetterProcessImpl implements ILetterProcess {

    @Override
    public void writeLetter(String context) {
        System.out.println("填写信的内容..." + context);
    }

    @Override
    public void wirteEnvelope(String address) {
        System.out.println("填写收件人地址及姓名..." + address);
    }

    @Override
    public void envelopeDeliver() {
        System.out.println("把信放到信封中...");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件...");
    }
}

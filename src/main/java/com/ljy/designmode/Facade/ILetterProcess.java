package com.ljy.designmode.Facade;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public interface ILetterProcess {

    /**
     * 首先要写信的内容
     * @param context
     */
    void writeLetter(String context);

    /**
     * 其次写信封
     * @param address
     */
    void wirteEnvelope(String address);

    /**
     * 把信放到信封里
     */
    void envelopeDeliver();

    /**
     * 然后邮递
     */
    void sendLetter();

}

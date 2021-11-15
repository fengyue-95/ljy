package com.ljy.designmode.Facade;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class LetterFacade {

    private LetterProcessImpl letterProcess =new LetterProcessImpl();

    private LetterCheckImpl letterCheck = new LetterCheckImpl();


    public void  sendLetter(String context,String address){
        letterCheck.letterCheck();

        letterProcess.writeLetter(context);
        letterProcess.wirteEnvelope(address);

        letterProcess.envelopeDeliver();
        letterProcess.sendLetter();
    }
}

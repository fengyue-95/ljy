package com.ljy.designmode.Prototype;

/**
 * @author fengyue
 * @date 2021/11/9
 */
public class Mail implements Cloneable{

    private String receiver;

    private String sender;

    private String subject;

    private String context;

    private String appellation;

    private String tail;

    public Mail(AdvTemplate template) {
        this.subject=template.getAdvSubject();
        this.context=template.getAdvContext();
    }

    @Override
    protected Mail clone() {
        Mail cloneMail=null;
        try {
            //浅复制
            cloneMail = (Mail)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloneMail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}

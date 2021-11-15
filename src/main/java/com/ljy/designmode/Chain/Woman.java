package com.ljy.designmode.Chain;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class Woman implements IWoman {

    private int type;

    private String request;

    public Woman(int type, String request) {
        this.request=request;
        this.type=type;

       switch (this.type){
           case 1:
               this.request = "女儿的请求是：" + request;
               break;
           case 2:
               this.request = "老婆的请求是：" + request;
               break;
           case 3:
               this.request = "母亲的请求是：" + request;
               break;
       }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}

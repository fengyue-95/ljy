package com.ljy.designmode.Chain;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class Father extends Handler {

    public Father(){
        super(Handler.father_type);
    }

    @Override
    void Response(IWoman iWoman) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(iWoman.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}

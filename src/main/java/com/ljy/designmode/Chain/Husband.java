package com.ljy.designmode.Chain;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class Husband extends Handler{

    public Husband() {
        super(Handler.husband_type);
    }

    @Override void Response(IWoman iWoman) {
        System.out.println("--------老婆向老公请示-------");
        System.out.println(iWoman.getRequest());
        System.out.println("老公的答复是:同意\n");
    }
}

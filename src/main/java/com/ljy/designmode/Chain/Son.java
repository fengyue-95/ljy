package com.ljy.designmode.Chain;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class Son extends Handler{
    public Son() {
        super(Handler.son_type);
    }

    @Override void Response(IWoman iWoman) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(iWoman.getRequest());
        System.out.println("儿子的答复是:同意\n");
    }
}

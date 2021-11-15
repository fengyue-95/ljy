package com.ljy.designmode.Bridge;

/**
 * @author fengyue
 * @date 2021/11/11
 */
public class IpodCrop extends Crop {

    public IpodCrop(Product product){
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("ipod赚钱啦");
    }
}

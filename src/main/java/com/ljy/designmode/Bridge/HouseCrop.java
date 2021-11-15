package com.ljy.designmode.Bridge;

/**
 * @author fengyue
 * @date 2021/11/11
 */
public class HouseCrop extends Crop{
    public HouseCrop(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("House赚钱啦");
    }
}

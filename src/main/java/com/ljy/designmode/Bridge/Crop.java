package com.ljy.designmode.Bridge;

/**
 * @author fengyue
 * @date 2021/11/11
 */
public abstract class Crop {

    private Product product;

    public Crop(Product product) {
        this.product = product;
    }

    public void makeMoney(){
        this.product.beProducted();
        this.product.beSelled();
    }

}

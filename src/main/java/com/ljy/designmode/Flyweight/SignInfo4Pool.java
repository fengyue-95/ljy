package com.ljy.designmode.Flyweight;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class SignInfo4Pool extends SignInfo{

    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

package com.ljy.designmode.Adapter;

/**
 * @author fengyue
 * @date 2021/11/9
 */
public class AdapterUser<T> extends OutUser implements IUserInfo {

    @Override
    public <T> T getName() {
        return (T)super.getOutName().get("name");
    }

    @Override
    public <T> T getPhone() {
        return (T)super.getOutPhone().get("phone");
    }

    @Override
    public <T> T getAddress() {
        return (T)super.getOutAddress().get("address");
    }
}

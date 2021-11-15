package com.ljy.designmode.Adapter;

/**
 * @author fengyue
 * @date 2021/11/9
 */
public class IUser<T> implements IUserInfo {

    @Override
    public <T> T getName() {
        return (T)"name";
    }

    @Override
    public <T> T getPhone() {
        return (T)"phone";
    }

    @Override
    public <T> T getAddress() {
        return (T)"address";
    }
}

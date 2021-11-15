package com.ljy.designmode.Adapter;

/**
 * @author fengyue
 * @date 2021/11/9
 */
public interface IUserInfo {

    <T> T getName();

    <T> T getPhone();

    <T> T getAddress();
}

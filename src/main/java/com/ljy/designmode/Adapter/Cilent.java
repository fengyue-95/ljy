package com.ljy.designmode.Adapter;

/**
 * @author fengyue
 * @date 2021/11/9
 */
public class Cilent {

    public static void main(String[] args) {
        IUser iUser = new IUser();
        System.out.println(iUser.getName());

        AdapterUser adapterUser = new AdapterUser();
        System.out.println(adapterUser.getName());
    }
}

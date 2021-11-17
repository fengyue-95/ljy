package com.ljy.other.test;

import com.ljy.designmode.Chain.Father;

/**
 * @author fengyue
 * @date 2021/11/16
 */
public class Client {

    public static void main(String[] args) {

        SonT sonT = new SonT();

        String father = getFather(sonT);
        System.out.println(father);
    }



    public static String getFather(FatherT father){
        return ((SonT)father).getName();
    }

}

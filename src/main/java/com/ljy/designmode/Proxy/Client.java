package com.ljy.designmode.Proxy;

/**
 * @author fengyue
 * @date 2021/11/15
 *
 * 代理模式
 */
public class Client {

    public static void main(String[] args) {
        GamePlayer gamePlayer = new GamePlayer("zhangshan");

        gamePlayer.login();
        gamePlayer.killMonster();
        gamePlayer.upgrade();

        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(gamePlayer);
        gamePlayerProxy.login();
        gamePlayerProxy.killMonster();
        gamePlayerProxy.upgrade();
    }
}

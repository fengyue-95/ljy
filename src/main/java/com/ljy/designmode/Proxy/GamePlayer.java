package com.ljy.designmode.Proxy;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void login() {
        System.out.println(name + "登录了");
    }

    @Override
    public void killMonster() {
        System.out.println(name + "杀怪");
    }

    @Override
    public void upgrade() {
        System.out.println(name + "升级");
    }
}

package com.ljy.designmode.Proxy;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class GamePlayerProxy {

    private final IGamePlayer iGamePlayer;

    public GamePlayerProxy(IGamePlayer iGamePlayer){
        this.iGamePlayer = iGamePlayer;
    }

    public void login() {
        this.iGamePlayer.login();
    }

    public void killMonster() {
        this.iGamePlayer.killMonster();
    }

    public void upgrade() {
        this.iGamePlayer.upgrade();

    }
}

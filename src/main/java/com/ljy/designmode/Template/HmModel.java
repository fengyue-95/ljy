package com.ljy.designmode.Template;

/**
 * @author fengyue
 * @date 2021/11/16
 */
public abstract class HmModel {

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    public void run() {
        // 先发动汽车
        this.start();
        // 引擎开始轰鸣
        this.engineBoom();
        // 然后就开始跑了，跑的过程中遇到一条狗挡路，就按喇叭
        this.alarm();
        // 到达目的地就停车
        this.stop();
    }
}

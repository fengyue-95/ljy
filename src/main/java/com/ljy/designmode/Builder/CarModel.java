package com.ljy.designmode.Builder;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

/**
 * @author fengyue
 * @date 2021/11/8
 */
public abstract class CarModel {

    private List<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        if (CollectionUtils.isEmpty(sequence)) {
            System.out.println("请输入指令");
            return;
        }

        for (int i = 0; i < sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) {
                this.start(); // 启动汽车
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop(); // 停止汽车
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm(); // 喇叭开始叫了
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                this.engineBoom(); // 引擎开始轰鸣 }
            }
        }
    }

    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }

}

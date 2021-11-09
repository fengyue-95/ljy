package com.ljy.designmode.AbstractFactory;

/**
 * @author fengyue
 * @date 2021/11/8
 */
public interface Human {

    /**
     * 每个人种的皮肤都有相应的颜色
     */

   public   void getColor();

    /**
     * 人类会说话
     */
    public void talk();

    /**
     * 性别
     */
    public void getSex();
}


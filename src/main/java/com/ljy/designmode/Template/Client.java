package com.ljy.designmode.Template;

/**
 * @author fengyue
 * @date 2021/11/16
 *
 * 模板方法
 *
 * 定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改 变一个算法的结构即可重定义该算法的某些特定步骤。
 */
public class Client {

    public static void main(String[] args) {
        Hm1Model hm1Model = new Hm1Model();
        hm1Model.run();

        Hm2Model hm2Model = new Hm2Model();
        hm2Model.run();
    }

}

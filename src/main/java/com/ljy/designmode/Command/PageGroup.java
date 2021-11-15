package com.ljy.designmode.Command;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class PageGroup implements Group{
    @Override
    public void find() {
        System.out.println("找到美工组...");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项页面...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项页面...");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项页面...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求页面变更计划...");
    }
}

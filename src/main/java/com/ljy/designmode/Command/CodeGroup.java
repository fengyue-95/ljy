package com.ljy.designmode.Command;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class CodeGroup implements Group {

    @Override
    public void find() {
        System.out.println("找到代码组...");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项功能...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项功能...");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项功能...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求代码变更计划...");
    }
}

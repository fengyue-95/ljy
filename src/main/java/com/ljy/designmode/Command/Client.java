package com.ljy.designmode.Command;

/**
 * @author fengyue
 * @date 2021/11/15
 *
 * 命令模式
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        AddRequirementCommand addRequirementCommand = new AddRequirementCommand();
        invoker.setCommand(addRequirementCommand);
        invoker.action();
    }
}

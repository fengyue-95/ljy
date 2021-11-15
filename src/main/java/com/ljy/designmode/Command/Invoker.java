package com.ljy.designmode.Command;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    void action() {
        command.execute();
    }
}

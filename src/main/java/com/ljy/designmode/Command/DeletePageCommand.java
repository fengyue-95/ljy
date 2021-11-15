package com.ljy.designmode.Command;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class DeletePageCommand extends Command {

    @Override
    void execute() {
        // 找到页面组
        super.pageGroup.find();
        // 删除一个页面
        super.requirementGroup.delete();
        // 给出计划
        super.requirementGroup.plan();
    }
}

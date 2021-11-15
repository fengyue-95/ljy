package com.ljy.designmode.Command;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public class AddRequirementCommand extends Command {

    @Override
    void execute() {
        //找到需求组
        super.requirementGroup.find();
        //增加一份需求
        super.requirementGroup.add();
        //给出计划
        super.requirementGroup.plan();
    }
}

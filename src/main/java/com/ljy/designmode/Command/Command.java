package com.ljy.designmode.Command;

/**
 * @author fengyue
 * @date 2021/11/15
 */
public abstract class Command {

    CodeGroup        codeGroup        = new CodeGroup();
    RequirementGroup requirementGroup = new RequirementGroup();
    PageGroup        pageGroup        = new PageGroup();

    abstract void execute();

}

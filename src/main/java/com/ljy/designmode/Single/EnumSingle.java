package com.ljy.designmode.Single;

/**
 * @author fengyue
 * @date 2021/11/8
 */
public class EnumSingle {

    private enum SingleTonObject {

        INSTANCE;

        private final EnumSingle instance;

        SingleTonObject(){
            instance = new EnumSingle();
        }

        public EnumSingle getInstance() {
            return instance;

        }
    }

    public static EnumSingle getInstance() {
        return SingleTonObject.INSTANCE.getInstance();
    }
}

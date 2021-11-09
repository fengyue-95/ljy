package com.ljy.designmode.Builder;

import java.util.ArrayList;

/**
 * @author fengyue
 * @date 2021/11/8
 */
public class BenzCarBuilder extends CarBuilder{

    BenzModel benzModel=new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}

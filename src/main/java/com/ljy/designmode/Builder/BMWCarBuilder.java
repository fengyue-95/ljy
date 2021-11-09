package com.ljy.designmode.Builder;

import java.util.ArrayList;

/**
 * @author fengyue
 * @date 2021/11/8
 */
public class BMWCarBuilder extends CarBuilder {

    BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}

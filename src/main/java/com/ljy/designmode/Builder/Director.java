package com.ljy.designmode.Builder;

import java.util.ArrayList;

/**
 * @author fengyue
 * @date 2021/11/8
 * 负责人
 */
public class Director {

    private ArrayList<String> sequence = new ArrayList();
    private BenzCarBuilder benzCarBuilder=new BenzCarBuilder();
    private BMWCarBuilder bmwCarBuilder=new BMWCarBuilder();

    public BenzModel getBenzA(){
        CarModel carModel = benzCarBuilder.getCarModel();
        this.sequence.clear(); //ABenzModel的执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");
        carModel.setSequence(sequence);
        return (BenzModel)carModel;
    }

    public BenzModel getBMWA(){
        CarModel carModel = bmwCarBuilder.getCarModel();
        this.sequence.clear(); //ABenzModel的执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");
        carModel.setSequence(sequence);
        return (BenzModel)carModel;
    }

}

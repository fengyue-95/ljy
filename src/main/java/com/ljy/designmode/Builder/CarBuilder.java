package com.ljy.designmode.Builder;

import java.util.ArrayList;

/**
 * @author fengyue
 * @date 2021/11/8
 */
public abstract class CarBuilder {

    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();

}

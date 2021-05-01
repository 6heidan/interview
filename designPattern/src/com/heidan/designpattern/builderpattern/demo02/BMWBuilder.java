package com.heidan.designpattern.builderpattern.demo02;


import com.heidan.designpattern.builderpattern.demo01.BMWModel;
import com.heidan.designpattern.builderpattern.demo01.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}

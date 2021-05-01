package com.heidan.designpattern.builderpattern.demo02;

import com.heidan.designpattern.builderpattern.demo01.BenzModel;
import com.heidan.designpattern.builderpattern.demo01.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}

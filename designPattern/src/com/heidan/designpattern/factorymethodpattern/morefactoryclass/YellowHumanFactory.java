package com.heidan.designpattern.factorymethodpattern.morefactoryclass;

import com.heidan.designpattern.factorymethodpattern.demo01.Human;
import com.heidan.designpattern.factorymethodpattern.demo01.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}

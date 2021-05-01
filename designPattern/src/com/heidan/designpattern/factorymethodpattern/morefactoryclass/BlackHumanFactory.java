package com.heidan.designpattern.factorymethodpattern.morefactoryclass;

import com.heidan.designpattern.factorymethodpattern.demo01.BlackHuman;
import com.heidan.designpattern.factorymethodpattern.demo01.Human;

public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}

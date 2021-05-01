package com.heidan.designpattern.factorymethodpattern.morefactoryclass;

import com.heidan.designpattern.factorymethodpattern.demo01.Human;
import com.heidan.designpattern.factorymethodpattern.demo01.WhiteHuman;

public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}

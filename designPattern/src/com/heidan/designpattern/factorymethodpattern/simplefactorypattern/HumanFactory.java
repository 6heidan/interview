package com.heidan.designpattern.factorymethodpattern.simplefactorypattern;

import com.heidan.designpattern.factorymethodpattern.demo01.Human;

//也叫静态工厂模式
public class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> c){
        //定义一个生产出的人种
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return (T) human;
    }
}

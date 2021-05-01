package com.heidan.principe.lawofdemeter.test02;

public class Teacher {
    public void command(GroupLeader groupLeader){
        groupLeader.countGirls();
    }
}

package com.heidan.principe.lawofdemeter.test01;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    public void command(GroupLeader groupLeader){
        List<Girl> listGirls = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listGirls.add(new Girl());
        }
        groupLeader.countGirls(listGirls);
    }
}

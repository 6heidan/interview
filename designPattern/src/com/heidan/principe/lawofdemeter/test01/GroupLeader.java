package com.heidan.principe.lawofdemeter.test01;

import java.util.List;

public class GroupLeader {
    public void countGirls(List<Girl> listGirls){
        System.out.println("女生数量是："+listGirls);
    }
}

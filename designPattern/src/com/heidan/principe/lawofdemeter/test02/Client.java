package com.heidan.principe.lawofdemeter.test02;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Girl> listGirl = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            listGirl.add(new Girl());
        }

        Teacher teacher = new Teacher();
        teacher.command(new GroupLeader(listGirl));
    }
}

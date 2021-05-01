package com.heidan.principe.lawofdemeter.test01;

public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.command(new GroupLeader());
    }
}

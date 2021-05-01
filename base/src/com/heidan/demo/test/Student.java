package com.heidan.demo.test;

public class Student {
    private String name;
    private Integer age;

    public Student(){}

    public Student(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        //如果当前对象和obj的内存地址相同，则二者必然指向同一个对象，返回true
        if (this==obj){
            return true;
        }
        //如果当前对象和obj的所有属性（这里指name和age）都相同，也认为二者比较结果为true
        if (obj instanceof Student){
            Student student = (Student) obj;
            //用传入的obj，和当前对象this比较
            if (this.name.equals(student.getName()) && this.age==student.getAge()){
                return true;
            }
        }
        return false;
    }

    //用对象的所有属性值作为hashcode的计算因子
//    @Override
//    public int hashCode(){
//        int result = 0;
//        result = result*31 + name.hashCode();
//        result = result*31 + age;
//        return result;
//    }

    @Override
    public int hashCode(){
        return name.hashCode() & age;
    }

}

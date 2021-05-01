package com.heidan.delivery;

//通过方法传基本数据类型和String，值不变，传对象和数组，值改变
public class TransferValueDemo {
    public void changeValue1(int age){
        age = 10;
    }
    public void changeValue2(Person person){
        person.setPersonName("heidan");
    }
    public void changeValue3(String string){
        string = "qinze";
    }

    public static void main(String[] args) {
        TransferValueDemo transferValueDemo = new TransferValueDemo();
        int age = 100;
        transferValueDemo.changeValue1(age);
        System.out.println("=========age:"+age);

        Person person = new Person("aaa");
        transferValueDemo.changeValue2(person);
        System.out.println("==========person:"+person.getPersonName());

        String s = "bbb";
        transferValueDemo.changeValue3(s);
        System.out.println("===========string:"+s);

    }

}
class Person {
    private Integer id;
    private String personName;

    public Person(String personName){
        this.personName = personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }
}

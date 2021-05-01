package com.heidan.principe.opencloseprinciple.test01;

public class NovelBook implements Book {
    private String name;
    private int price;
    private String author;

    public NovelBook(String name,int price,String author){
        this.name = name;
        this.price = price;
        this.author = author;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}

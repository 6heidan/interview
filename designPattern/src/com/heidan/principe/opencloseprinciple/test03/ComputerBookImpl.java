package com.heidan.principe.opencloseprinciple.test03;

public class ComputerBookImpl implements ComputerBook {
    private String name;
    private String scope;
    private String author;
    private int price;

    public ComputerBookImpl(String name, String scope, String author, int price) {
        this.name = name;
        this.scope = scope;
        this.author = author;
        this.price = price;
    }

    @Override
    public String getScope() {
        return this.scope;
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

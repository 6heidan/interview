package com.heidan.principe.opencloseprinciple.test03;

import com.heidan.principe.opencloseprinciple.test01.Book;

public interface ComputerBook extends Book {
    //计算机书籍是有一个范围
    public String getScope();
}

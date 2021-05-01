package com.heidan.principe.opencloseprinciple.test02;

import com.heidan.principe.opencloseprinciple.test01.Book;
import com.heidan.principe.opencloseprinciple.test01.NovelBook;
import junit.framework.TestCase;

public class NovelBookTest extends TestCase {
    private String name = "平凡的世界";
    private int price = 6000;
    private String author = "路遥";
    private Book novelBook = new NovelBook(name,price,author);

    public void testGetPrice(){
        //原价销售，根据输入和输出的值是否相等进行断言
        super.assertEquals(this.price,this.novelBook.getPrice());
    }
}

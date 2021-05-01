package com.heidan.principe.opencloseprinciple.test02;

import com.heidan.principe.opencloseprinciple.test01.Book;
import junit.framework.TestCase;

public class OffNovelBookTest extends TestCase {
    private Book below40NovelBook = new OffNovelBook("平凡的世界",3000,"路遥");
    private Book above40NovelBook = new OffNovelBook("平凡的世界",6000,"路遥");

    //测试低于40元的书籍是否打8折
    public void testGetPriceBelow40(){
        super.assertEquals(2400,this.below40NovelBook.getPrice());
    }

    //测试大于40的书籍是否打九折
    public void testGetPriceAbove40(){
        super.assertEquals(5400,this.above40NovelBook.getPrice());
    }

}

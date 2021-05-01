package com.heidan.principe.opencloseprinciple.test03;

import com.heidan.principe.opencloseprinciple.test01.Book;
import com.heidan.principe.opencloseprinciple.test01.NovelBook;

import java.text.NumberFormat;
import java.util.ArrayList;

public class BookStore {
    private static final ArrayList<Book> bookList = new ArrayList<>();
    //初始化数据，实际项目中一般由持久层完成
    static {
        bookList.add(new NovelBook("天龙八部",3200,"金庸"));
        bookList.add(new NovelBook("巴黎圣母院",5600,"雨果"));
        bookList.add(new NovelBook("悲惨世界",3500,"雨果"));
        bookList.add(new NovelBook("金瓶梅",4300,"兰陵笑笑生"));
        bookList.add(new ComputerBookImpl("Think in Java","编程语言","Bruce Eckel",4300));

    }

    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        formatter.setMaximumFractionDigits(2);
        System.out.println("=========书店卖出的书籍记录如下：===========");
        for (Book book : bookList) {
            System.out.println("书籍名称："+book.getName()+
                    "\t书籍作者："+book.getAuthor()+
                    "\t书籍价格："+formatter.format(book.getPrice()/100.0)+"元");
        }
    }
}

package com.seanna.sevice;

import com.seanna.pojo.Book;
import com.seanna.service.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.inject.Inject;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BookServiceTestCase {
    @Inject
    private BookService bookService;

    @Test
    public void testFindAll(){
        List<Book> bookList = bookService.findAllBook();
        Assert.assertEquals(bookList.size(),29);
    }

    @Test
    public void testSaveBook(){
        Book book=new Book();
        book.setBookname("SSM实战");
        book.setBookauthor("李密思");
        book.setBooknum(20);
        book.setBookprice(20f);
        book.setPubid(2);
        book.setTypeid(1);
        bookService.saveBook(book);
    }

    @Test
    public void testFindBookById(){
        Book book=bookService.findBook(3);
        Assert.assertNotNull(book);
    }

    @Test
    public void testUpdateBook(){
        Book book=bookService.findBook(3);
        book.setBookprice(200f);
        bookService.updateBook(book);
    }

    @Test
    public void testDelBook(){
        bookService.delBook(37);
    }
}

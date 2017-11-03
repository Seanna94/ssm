package com.seanna.service;

import com.seanna.mapper.BookMapper;
import com.seanna.mapper.BookTypeMapper;
import com.seanna.mapper.PublisherMapper;
import com.seanna.pojo.Book;
import com.seanna.pojo.BookType;
import com.seanna.pojo.Publisher;
import org.springframework.transaction.annotation.Transactional;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@Transactional
public class BookService {
    @Inject
    private BookMapper bookMapper;
    @Inject
    private BookTypeMapper bookTypeMapper;
    @Inject
    private PublisherMapper publisherMapper;

    public void saveBook(Book book){
        bookMapper.save(book);
    }

    public List<Book> findAllBook(){
        return bookMapper.findAll();
    }
    public void delBook(Integer id){
        bookMapper.del(id);
    }
    public void updateBook(Book book){
        bookMapper.update(book);
    }
    public Book findBook(Integer id){
        return bookMapper.findById(id);
    }
    public Book findBookById(Integer id){
        return bookMapper.findById(id);
    }

    public List<BookType> findAllBookType(){
        return  bookTypeMapper.findAll();
    }

    public List<Publisher> findAllPublisher() {
        return publisherMapper.findAll();
    }


}























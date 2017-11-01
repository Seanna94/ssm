package com.seanna.service;

import com.seanna.mapper.BookMapper;
import com.seanna.mapper.BookTypeMapper;
import com.seanna.mapper.PublisherMapper;
import com.seanna.pojo.Book;
import com.seanna.pojo.Publisher;
import org.springframework.transaction.annotation.Transactional;
import javax.inject.Inject;
import javax.inject.Named;

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
}























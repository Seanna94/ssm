package com.seanna.mapper;

import com.seanna.pojo.Book;

import java.util.List;

public interface BookMapper {
    void save(Book book);
    List<Book> findAll();
    void del(Integer id);
    void update(Book id);
    Book findById(Integer id);
}

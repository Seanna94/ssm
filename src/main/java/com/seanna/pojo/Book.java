package com.seanna.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable{
    private Integer id;
    private String bookname;
    private String bookauthor;
    private Float bookprice;
    private Integer bookmum;
    private Integer typeid;
    private Integer pubid;

    private BookType bookType;
    private Publisher publisher;
}

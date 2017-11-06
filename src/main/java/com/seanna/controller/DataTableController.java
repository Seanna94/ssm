package com.seanna.controller;

import com.seanna.pojo.Book;
import com.seanna.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping("/datatables")
public class DataTableController {
    @Inject
    private BookService bookService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("types",bookService.findAllBookType());
        model.addAttribute("pubs",bookService.findAllPublisher());
        List<Book> bookList=bookService.findAllBook();
        model.addAttribute("bookList",bookList);
        return "datatables/list";
    }

}





















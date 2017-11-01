package com.seanna.controller;

import com.seanna.pojo.Book;
import com.seanna.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.inject.Inject;

public class BookController {
    @Inject
    private BookService bookService;

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public String saveBook(Book book, RedirectAttributes redirectAttributes) {
        bookService.saveBook(book);
        redirectAttributes.addFlashAttribute("message","操作成功");
        return "redirect:/books";
    }

}
























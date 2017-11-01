package com.seanna.controller;

import com.seanna.pojo.Book;
import com.seanna.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.inject.Inject;

@Controller
public class BookController {
    @Inject
    private BookService bookService;

    @RequestMapping(value = "/new",method = RequestMethod.GET)
    public String saveBook(Book book, RedirectAttributes redirectAttributes) {
        bookService.saveBook(book);
        redirectAttributes.addFlashAttribute("message","操作成功");
        return "redirect:/books";
    }
    @RequestMapping(value = "/test",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String test(){
        return "测试中文";
    }

}
























package com.seanna.controller;

import com.seanna.exception.NotFoundException;
import com.seanna.pojo.Book;
import com.seanna.pojo.BookType;
import com.seanna.pojo.Publisher;
import com.seanna.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Inject
    private BookService bookService;

    @RequestMapping(value="/{id:\\d+}",method = RequestMethod.GET)
    public String editBook(@PathVariable Integer id,Model model){
        Book book=bookService.findBookById(id);
        if(book==null){
            throw new NotFoundException();
        }
        model.addAttribute("types",bookService.findAllBookType());
        model.addAttribute("pubs",bookService.findAllPublisher());
        model.addAttribute("book",book);
        return "/books/edit";
    }

    @RequestMapping(value = "/{id:\\d+}",method = RequestMethod.POST)
    public String editBook(Book book,RedirectAttributes redirectAttributes){
        bookService.updateBook(book);
        redirectAttributes.addFlashAttribute("message","操作成功");
        return "redirect:/books";
    }

    @RequestMapping(value = "/{id:\\d+}/del",method = RequestMethod.GET)
    public String delBook(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        bookService.delBook(id);
        redirectAttributes.addFlashAttribute("message","操作成功");
        return "redirect:/books";
    }

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public String saveBook(Book book, RedirectAttributes redirectAttributes){
        bookService.saveBook(book);
        redirectAttributes.addFlashAttribute("message","操作成功");
        return "redirect:/books";
    }

    @RequestMapping(value = "/new",method = RequestMethod.GET)
    public String saveBook(Model model) {
        List<Publisher> publisherList=bookService.findAllPublisher();
        List<BookType> bookTypeList=bookService.findAllBookType();
        model.addAttribute("pubs",publisherList);
        model.addAttribute("types",bookTypeList);
        return "books/new";
    }
    @RequestMapping(value = "/test",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String test(){
        return "测试中文";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model){
        List<Book> bookList=bookService.findAllBook();

        model.addAttribute("bookList",bookList);
        return  "books/list";
    }

}
























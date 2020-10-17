package com.example.myspringexample.controllers;

import com.example.myspringexample.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookControllers {

    private final BookRepository bookrepository;

    public BookControllers(BookRepository bookrepository) {
        this.bookrepository = bookrepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookrepository.findAll());

        return "books/list";
    }
}

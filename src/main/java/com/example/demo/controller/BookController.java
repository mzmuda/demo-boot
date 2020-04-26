package com.example.demo.controller;

import com.example.demo.BookService;
import com.example.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("list")
    List<Book> list() {
        try {
            Thread.sleep(300);
            //let's just add some comment here
        } catch (InterruptedException e) {
            e.printStackTrace();
            //And maybe a bit of logging here
            System.out.println("Logging an exception: " + e);
        }
        return bookService.list();
    }

    @GetMapping("add")
    void add(String title) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bookService.create(title);
    }

}

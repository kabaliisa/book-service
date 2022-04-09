package com.example.book.controller;

import com.example.book.domain.Book;
import com.example.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping()
    public void addBook(Book book){
        bookService.addBook(book);
    }

    @GetMapping()
    public List<Book> getBook(){
        return bookService.getAllBooks();
    }

    @PutMapping("/{id}")
    public Book updateBook(@RequestBody Book book){
        return bookService.update(book);
    }


    @DeleteMapping("/{isbn}")
    public void deleteBook(@PathVariable String isbn){

        bookService.deleteBook(isbn);
    }

    @GetMapping("/{isbn}")
    public Book getBook(@PathVariable String isbn){
        return bookService.getBook(isbn);
    }




}

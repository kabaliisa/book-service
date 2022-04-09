package com.example.book.service;

import com.example.book.domain.Book;
import com.example.book.repository.BookRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class BookService {
    @Autowired
    BookRepo bookRepo;

    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }

    public Book update(Book book){
        return bookRepo.save(book);
    }

    public void deleteBook(String isbn){
        bookRepo.delete(getBook(isbn));
    }

    public Book getBook(String isbn){

        return bookRepo.findByIsbn(isbn);
    }

    public void addBook(Book book){
        bookRepo.save(book);
    }

    public List<Book> searchBooks(String author){
        return bookRepo.findByAuthor(author);
    }

}

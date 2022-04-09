package com.example.book.repository;

import com.example.book.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

    Book findByIsbn(String isbn);

    List<Book> findByAuthor(String author);

    void deleteByIsbn(String isbn);
}

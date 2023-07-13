package com.example.bookservice.service;

import com.example.bookservice.dao.BooksRepository;
import com.example.bookservice.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {

   private final BooksRepository booksRepository;

    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> findAllBooks() {
       return booksRepository.findAll();
   }
}

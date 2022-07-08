package com.example.bookStore.controller;

import com.example.bookStore.dto.BookDto;
import com.example.bookStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<List<BookDto>> getBooks(){
        List<BookDto> books=bookService.getBooks();
    return ResponseEntity.ok(books);
    }
}

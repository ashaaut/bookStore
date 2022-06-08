package com.example.bookStore.controller;

import com.example.bookStore.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/books")
    public ResponseEntity<List<BookDto>> getBooks(){
        BookDto book=BookDto.builder().title("Do epic shit").build();
        List<BookDto> books=new ArrayList<>();
        books.add(book);
    return ResponseEntity.ok(books);
    }
}

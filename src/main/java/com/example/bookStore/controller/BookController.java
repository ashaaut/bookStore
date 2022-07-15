package com.example.bookStore.controller;

import com.example.bookStore.dto.BookDto;
import com.example.bookStore.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "Book Api",tags = "Book Api",produces = "application/json")
@RestController

public class BookController {
    @Autowired
    private BookService bookService;

    @ApiOperation(value = "get list of books",response = BookDto[].class,produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "successfully retrieved the list of books"),
            @ApiResponse(code = 404,message = "not found")
    })
    @GetMapping("/books")
    public ResponseEntity<List<BookDto>> getBooks(){
        List<BookDto> books=bookService.getBooks();
    return ResponseEntity.ok(books);
    }
}

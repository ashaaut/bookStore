package com.example.bookStore.services;

import com.example.bookStore.dto.BookDto;
import com.example.bookStore.model.Book;
import com.example.bookStore.repository.BookRepository;
import com.example.bookStore.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;

    @Mock
    private ModelMapper mapper;

    @Test
    void shouldReturnListOfBooksWhenGetBooksCalled(){
        List<Book> books=new ArrayList<>();
        Book book=getBook();
        books.add(book);
        BookDto bookDto=getBookDto();
        when(bookRepository.findAll()).thenReturn(books);
        when(mapper.map(book, BookDto.class)).thenReturn(bookDto);
        List<BookDto> bookDtos=bookService.getBooks();
        assertThat(1).isEqualTo(bookDtos.size());
        assertThat(bookDtos.get(0)).isNotNull().hasFieldOrPropertyWithValue("title","test title");
    }
    private Book getBook(){
        return  Book.builder()
                .title("test title")
                .description("all good")
                .id(UUID.randomUUID())
                .releaseYear(2020)
                .build();
    }

    private BookDto getBookDto(){
        return BookDto.builder()
                .title("test title")
                .description("all good")
                .id(UUID.randomUUID())
                .releaseYear(2020)
                .build();

    }
}
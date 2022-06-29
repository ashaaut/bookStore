package com.example.bookStore.repository;

import com.example.bookStore.model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.stream.StreamSupport;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    @Sql(scripts = {"classpath:InsertInitialBookRecordFrTest.sql"})
    void shouldAbleToFetchAllBooksInDb(){
        Iterable<Book>all = bookRepository.findAll();
        Long totalBookCount= StreamSupport.stream(all.spliterator(),false).count();
        Assertions.assertEquals(totalBookCount,1);
    }

    @Test
    @Sql(scripts = {"classpath:InsertInitialBookRecordFrTest.sql"})
    void shouldReturnOneBookWhenTitleIsTestTitle() {
        List<Book> changing_the_sky = bookRepository.findBooksByTitle("changing the sky");
        Assertions.assertEquals(changing_the_sky.size(),1);
    }
}

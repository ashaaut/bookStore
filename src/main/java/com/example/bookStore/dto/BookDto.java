package com.example.bookStore.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // to use getters and setters
@Builder //builder design pattern
@AllArgsConstructor // for all args constructor
@NoArgsConstructor // constructor with no args
public class BookDto {
    private String  title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

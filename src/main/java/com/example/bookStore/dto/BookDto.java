package com.example.bookStore.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data // to use getters and setters
@Builder //builder design pattern
@AllArgsConstructor // for all args constructor
@NoArgsConstructor // constructor with no args
public class BookDto {
    private UUID id;

    private  String title;

    private  String description;

    private  int releaseYear;
}

package com.example.bookStore.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data // to use getters and setters
@Builder //builder design pattern
@AllArgsConstructor // for all args constructor
@NoArgsConstructor // constructor with no args
@ApiModel(value = "BookDto",description = "All details about book")

public class BookDto {
    @ApiModelProperty(readOnly = true,
    value = "UUID",
    dataType = "UUID",
    example = "81CBB42C-73A0-9660-6C7D-2FE94627F3A3",
    notes = "The database generated uuid for book id",
    required = true)
    private UUID id;

    @ApiModelProperty(readOnly = true,
            value = "title",
            dataType = "String",
            example = "Do epic shit",
            notes = "Book title",
            required = true)
    private  String title;


    @ApiModelProperty(readOnly = true,
            value = "description",
            dataType = "String",
            example = "book description",
            notes = "Book description",
            required = true)
    private  String description;

    @ApiModelProperty(readOnly = true,
            value = "releaseYear",
            dataType = "int",
            example = "2014",
            notes = "book release year",
            required = true)
    private  int releaseYear;
}

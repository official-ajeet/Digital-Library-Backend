package com.example.digitallibrary.dto;

import com.example.digitallibrary.models.Book;
import com.example.digitallibrary.models.enums.Genre;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponse {
    private int id;
    private String bookName;
    private Genre genre;
    private int pages;
    private String authorName;
    private Date createdOn;
    private Date updatedOn;


    public BookResponse(Book book, List<Book>bookList){
        this.id = book.getId();
        this.bookName = book.getName();
        this.genre = book.getGenre();
        this.pages = book.getPages();
        this.authorName = book.getAuthor().getName();
    }


}

package com.example.digitallibrary.dto;

import com.example.digitallibrary.models.Book;
import com.example.digitallibrary.models.Student;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentResponse implements Serializable{
    private int id;
    private String name;
    private String contact;
    private Date createdOn;
    private Date updatedOn;
    private Date validity;
//    private List<Book> bookList;

    public StudentResponse(Student student) {
        this.id = student.getId();
        this.name = student.getName();
        this.contact = student.getContact();
        this.createdOn = student.getCreatedOn();
        this.updatedOn = student.getUpdatedOn();
        this.validity = student.getValidity();
//        this.bookList = student.getBookList();
    }

    public static StudentResponse from(Student student){
        return StudentResponse.builder()
                .id(student.getId())
                .name(student.getName())
                .contact(student.getContact())
//                .bookList(student.getBookList())
                .createdOn(student.getCreatedOn())
                .updatedOn(student.getUpdatedOn())
                .validity(student.getValidity())
                .build();
    }

}

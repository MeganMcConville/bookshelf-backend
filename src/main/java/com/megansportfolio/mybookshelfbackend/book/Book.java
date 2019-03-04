package com.megansportfolio.mybookshelfbackend.book;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book{


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "current_page")
    private long currentPage;

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public long getCurrentPage(){
        return this.currentPage;
    }

    public void setCurrentPage(long currentPage){
        this.currentPage = currentPage;
    }

}
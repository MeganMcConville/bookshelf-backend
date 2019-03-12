package com.megansportfolio.mybookshelfbackend.book;

import com.megansportfolio.mybookshelfbackend.comment.Comment;

import javax.persistence.*;
import java.util.List;

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

    @Column(name = "shelf_id")
    private long shelfId;

    @OneToMany(mappedBy = "bookId")
    private List<Comment> comments;

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

    public long getShelfId() {
        return this.shelfId;
    }

    public void setShelfId(long shelfId) {
        this.shelfId = shelfId;
    }

    public List<Comment> getComments(){
        return this.comments;
    }

    public void setComments(List<Comment> comments){
        this.comments = comments;
    }
}
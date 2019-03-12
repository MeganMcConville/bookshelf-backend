package com.megansportfolio.mybookshelfbackend.comment;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "content")
    private String content;

    @Column(name = "book_id")
    private long bookId;

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getContent(){
        return this.content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public long getBookId(){
        return this.bookId;
    }

    public void setBookId(long bookId){
        this.bookId = bookId;
    }
}

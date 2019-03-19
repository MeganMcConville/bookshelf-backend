package com.megansportfolio.mybookshelfbackend.shelf;

import com.megansportfolio.mybookshelfbackend.book.Book;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shelf")
public class Shelf {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "shelfId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;

    public long getId(){
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks(){
        return this.books;
    }

    public void setBooks(List<Book> books){
        this.books = books;
    }
}

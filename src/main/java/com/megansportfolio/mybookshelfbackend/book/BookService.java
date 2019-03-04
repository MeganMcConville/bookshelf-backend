package com.megansportfolio.mybookshelfbackend.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public List<Book> getBooks(){
        return bookDao.findAll();
    }
}

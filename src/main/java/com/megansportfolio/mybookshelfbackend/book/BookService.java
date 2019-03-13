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

    public void updateCurrentPage(long bookId, long currentPage){
        Book book = bookDao.findById(bookId).get();
        book.setCurrentPage(currentPage);
        bookDao.save(book);
    }

    public long createNewBook(Book book){
        return bookDao.save(book).getId();
    }
}

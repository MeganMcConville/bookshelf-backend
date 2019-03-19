package com.megansportfolio.mybookshelfbackend.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @RequestMapping(value = "/{bookId}/updateCurrentPage", method = RequestMethod.POST)
    public void updateCurrentPage(@PathVariable long bookId, @RequestParam(value = "currentPage") long currentPage){
        bookService.updateCurrentPage(bookId, currentPage);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public long createNewBook(@RequestBody Book book){
        return bookService.createNewBook(book);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{bookId}")
    public void deleteBook(@PathVariable long bookId){
        bookService.deleteBook(bookId);
    }

}

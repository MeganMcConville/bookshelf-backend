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

}

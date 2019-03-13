package com.megansportfolio.mybookshelfbackend.shelf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/shelves", consumes = "application/json")
public class ShelfController {

    @Autowired
    private ShelfService shelfService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Shelf> getShelves(){
        return shelfService.getShelves();
    }

    @RequestMapping(method = RequestMethod.POST)
    public long createNewShelf(@RequestBody Shelf shelf){

        return shelfService.createNewShelf(shelf);

    }
}

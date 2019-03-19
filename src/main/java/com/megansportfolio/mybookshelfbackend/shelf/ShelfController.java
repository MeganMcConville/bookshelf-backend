package com.megansportfolio.mybookshelfbackend.shelf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/shelves")
public class ShelfController {

    @Autowired
    private ShelfService shelfService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Shelf> getShelves(){
        return shelfService.getShelves();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public long createNewShelf(@RequestBody Shelf shelf){

        return shelfService.createNewShelf(shelf);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{shelfId}")
    public void deleteShelf(@PathVariable long shelfId){
        shelfService.deleteShelf(shelfId);
    }
}

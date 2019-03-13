package com.megansportfolio.mybookshelfbackend.shelf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelfService {

    @Autowired
    private ShelfDao shelfDao;

    public List<Shelf> getShelves(){
        return shelfDao.findAll();
    }

    public long createNewShelf(Shelf shelf){
        return shelfDao.save(shelf).getId();
    }
}

package com.megansportfolio.mybookshelfbackend.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentDao commentDao;

    public long saveComment(Comment comment){
        return commentDao.save(comment).getId();
    }

}

package com.be.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.be.models.Comment;
import com.be.repositories.CommentRepository;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public ResponseEntity<Comment> findCommentById(String id) {
        try {
            Comment comment = commentRepository.findById(id).orElseThrow(() -> new Error("Comment not found."));
            return new ResponseEntity<Comment>(comment, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            return new ResponseEntity<Comment>(HttpStatus.NOT_FOUND);
        }
    }
}

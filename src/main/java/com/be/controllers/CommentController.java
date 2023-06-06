package com.be.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import com.be.models.Comment;
import com.be.services.CommentService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping()
    public ResponseEntity<Comment> deleteComment(@RequestBody String id) {
        return commentService.findCommentById(id);
    }
}

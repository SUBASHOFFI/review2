package com.example.agricultureloan.service;



import com.example.agricultureloan.model.Comment;
import com.example.agricultureloan.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;
    
    public Comment saveComment(String username, String role, String content) {
        Comment comment = new Comment();
        comment.setUsername(username);
        comment.setRole(role);
        comment.setContent(content);
        comment.setTimestamp(LocalDateTime.now());

        // Add debug logs
        System.out.println("Saving comment: " + comment);

        return commentRepository.save(comment);
    }

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }
}

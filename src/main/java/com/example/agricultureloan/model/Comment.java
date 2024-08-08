package com.example.agricultureloan.model;





import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Comment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String username;
    
    @Column(nullable = false)
    private String role; // "user" or "admin"
    
    @Column(nullable = false)
    private String content;
    
    @Column(nullable = false)
    private LocalDateTime timestamp;
}

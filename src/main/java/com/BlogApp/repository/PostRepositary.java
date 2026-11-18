package com.BlogApp.repository;

import com.BlogApp.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepositary extends JpaRepository<Post,Long> {
    List<Post> id(Long id);
}

package com.blog.repository;

import com.blog.model.BlogPost;

import java.util.List;

public interface BlogPostRepository {
    void save(BlogPost blogPost);
    List<BlogPost> findAll();
    BlogPost findById(String id);
    void update(BlogPost blogPost);
    void delete(String id);
}

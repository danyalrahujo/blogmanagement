package com.blog.controller;

import com.blog.model.BlogPost;
import com.blog.repository.BlogPostRepository;
import com.blog.view.BlogPostView;

public class BlogPostController {
    private BlogPostView blogPostView;
    private BlogPostRepository blogPostRepository;

    public BlogPostController(BlogPostView blogPostView, BlogPostRepository blogPostRepository) {
        this.blogPostView = blogPostView;
        this.blogPostRepository = blogPostRepository;
    }

    public void allPosts() {
        blogPostView.showAllPosts(blogPostRepository.findAll());
    }

    public void newPost(BlogPost post) {
        BlogPost existing = blogPostRepository.findById(post.getId());
        if (existing != null) {
            blogPostView.showError("Post already exists with id " + post.getId(), existing);
            return;
        }
        blogPostRepository.save(post);
        blogPostView.postAdded(post);
    }

    public void deletePost(BlogPost post) {
        if (blogPostRepository.findById(post.getId()) == null) {
            blogPostView.showError("No post exists with id " + post.getId(), post);
            return;
        }
        blogPostRepository.delete(post.getId());
        blogPostView.postRemoved(post);
    }
}

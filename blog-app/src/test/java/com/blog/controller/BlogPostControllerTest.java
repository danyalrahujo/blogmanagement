package com.blog.controller;

import com.blog.model.BlogPost;
import com.blog.repository.BlogPostRepository;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BlogPostControllerTest {

    private BlogPostController blogPostController;
    private BlogPostRepository blogPostRepository;

    @Before
    public void setUp() {
        // Mock the BlogPostRepository
        blogPostRepository = mock(BlogPostRepository.class);
        // Pass the mocked repository to the controller
        blogPostController = new BlogPostController(null, blogPostRepository); // null view for this test
    }

    @Test
    public void testAddPost() {
        BlogPost post = new BlogPost("1", "Title", "Content", "Author", "2025-04-01");
        blogPostController.newPost(post);
        // Verify that the repository's save method was called
        verify(blogPostRepository).save(post);
    }
}

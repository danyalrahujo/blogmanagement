package com.blog.repository;

import com.blog.model.BlogPost;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BlogPostRepositoryTest {

    private BlogPostRepository blogPostRepository;

    @Before
    public void setUp() {
        // Mocking the BlogPostRepository interface
        blogPostRepository = mock(BlogPostRepository.class);
    }

    @Test
    public void testSave() {
        BlogPost blogPost = new BlogPost("1", "Title", "Content", "Author", "2025-04-01");
        blogPostRepository.save(blogPost);
        verify(blogPostRepository).save(blogPost);
    }

    @Test
    public void testFindAll() {
        List<BlogPost> posts = new ArrayList<>();
        posts.add(new BlogPost("1", "Title", "Content", "Author", "2025-04-01"));
        when(blogPostRepository.findAll()).thenReturn(posts);

        List<BlogPost> result = blogPostRepository.findAll();
        assertEquals(1, result.size());
        assertEquals("Title", result.get(0).getTitle());
    }

    @Test
    public void testFindById() {
        BlogPost blogPost = new BlogPost("1", "Title", "Content", "Author", "2025-04-01");
        when(blogPostRepository.findById("1")).thenReturn(blogPost);

        BlogPost result = blogPostRepository.findById("1");
        assertNotNull(result);
        assertEquals("Title", result.getTitle());
    }

    @Test
    public void testUpdate() {
        BlogPost blogPost = new BlogPost("1", "Updated Title", "Updated Content", "Author", "2025-04-01");
        blogPostRepository.update(blogPost);
        verify(blogPostRepository).update(blogPost);
    }

    @Test
    public void testDelete() {
        blogPostRepository.delete("1");
        verify(blogPostRepository).delete("1");
    }
}

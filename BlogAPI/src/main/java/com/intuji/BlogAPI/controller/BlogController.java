package com.intuji.BlogAPI.controller;


import com.intuji.BlogAPI.model.Blog;
import com.intuji.BlogAPI.service.BlogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {

    private final BlogService blogService;


    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping
    public List<Blog> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> getBlogById(
            @PathVariable Integer id
    ) {
       Blog blog = blogService.getBlogById(id);
        if (blog != null) {
            return ResponseEntity.ok(blog);
        }
        return ResponseEntity.notFound().build();

    }

    @PostMapping
    public ResponseEntity<Blog> createBlog(
            @RequestBody Blog blog
    ) {
        return ResponseEntity.ok(blogService.createBlog(blog));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Blog> updateBlog(
            @PathVariable Integer id,
            @RequestBody Blog blogDetails
    ) {
        Blog updatedBlog = blogService.updateBlog(id, blogDetails);
        if (updatedBlog != null) {
            return ResponseEntity.ok(updatedBlog);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBlog(
            @PathVariable Integer id
    ) {
        blogService.deleteBlog(id);
        return ResponseEntity.ok("Blog with ID " + id + " deleted successfully.");
    }

}

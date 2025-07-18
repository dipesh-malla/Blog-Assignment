package com.intuji.BlogAPI.service;

import com.intuji.BlogAPI.model.Blog;
import com.intuji.BlogAPI.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    public Blog getBlogById(Integer id) {
        return blogRepository.findById(id).orElse(null);
    }

    public Blog createBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    public Blog updateBlog(Integer id, Blog blogDetails) {
        Blog blog = blogRepository.findById(id).orElse(null);
        if (blog != null) {
            blog.setTitle(blogDetails.getTitle() != null ? blogDetails.getTitle() : blog.getTitle());
            blog.setDescription(blogDetails.getDescription() != null ? blogDetails.getDescription() : blog.getDescription());
            blog.setCategory(blogDetails.getCategory() != null ? blogDetails.getCategory() : blog.getCategory());
            return blogRepository.save(blog);
        }
        return null;
    }

    public void deleteBlog(Integer id) {
        blogRepository.deleteById(id);
    }
}

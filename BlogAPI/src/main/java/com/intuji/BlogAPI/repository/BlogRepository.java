package com.intuji.BlogAPI.repository;

import com.intuji.BlogAPI.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}

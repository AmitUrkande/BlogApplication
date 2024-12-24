package com.any.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.any.entity.Category;
import com.any.entity.Post;
import com.any.entity.User;

public interface PostRepo extends JpaRepository<Post, Integer>
{
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	List<Post> findByTitleContaining(String title);
}

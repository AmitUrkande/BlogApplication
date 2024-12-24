package com.any.service;

import java.util.List;

import com.any.entity.Post;
import com.any.payload.PostDto;
import com.any.payload.PostResponse;

public interface PostService 
{
	//create 
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//get all post
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	//get single post
	PostDto getPostById(Integer postId);
	
	//get all post by category
	List<PostDto> getPostByCategory(Integer categoryId);
	
	// get all post by user
	List<PostDto> getPostByUser(Integer userId);
	
	//search posts
	List<PostDto> searchPost(String keyword);
	
}

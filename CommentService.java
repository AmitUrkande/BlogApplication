package com.any.service;


import com.any.payload.CommentDto;

public interface CommentService 
{
	CommentDto createComment(CommentDto commetnDto, Integer postId);
	
	void deleteComment(Integer commentId);
	
	
}

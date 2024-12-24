package com.any.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.any.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>
{
}

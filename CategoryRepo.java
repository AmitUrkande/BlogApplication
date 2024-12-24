package com.any.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.any.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> 
{

}

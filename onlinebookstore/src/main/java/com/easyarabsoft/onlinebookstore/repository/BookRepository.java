package com.easyarabsoft.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easyarabsoft.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}


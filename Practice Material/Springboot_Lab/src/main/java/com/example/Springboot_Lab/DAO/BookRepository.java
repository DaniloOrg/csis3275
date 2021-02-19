package com.example.Springboot_Lab.DAO;

import com.example.Springboot_Lab.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}

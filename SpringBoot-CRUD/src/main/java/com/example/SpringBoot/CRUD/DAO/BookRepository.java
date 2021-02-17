package com.example.SpringBoot.CRUD.DAO;

import com.example.SpringBoot.CRUD.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {

}

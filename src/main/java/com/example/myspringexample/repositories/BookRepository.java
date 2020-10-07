package com.example.myspringexample.repositories;

import com.example.myspringexample.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{
}

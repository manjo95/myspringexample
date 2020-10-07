package com.example.myspringexample.repositories;

import com.example.myspringexample.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}

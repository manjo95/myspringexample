package com.example.myspringexample.repositories;

import com.example.myspringexample.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}

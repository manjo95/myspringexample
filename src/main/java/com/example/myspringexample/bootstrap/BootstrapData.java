package com.example.myspringexample.bootstrap;

import com.example.myspringexample.domain.Author;
import com.example.myspringexample.domain.Book;
import com.example.myspringexample.domain.Publisher;
import com.example.myspringexample.repositories.AuthorRepository;
import com.example.myspringexample.repositories.BookRepository;
import com.example.myspringexample.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository pubRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository pubRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.pubRepository = pubRepository;

    }

    @Override
    public void run(String... args) throws Exception {

        Author manoj =new Author("Manoj", "KS");
        Book dp = new Book("Deceptionpoint", "1234");
        Publisher dab = new Publisher("DanBrown", "waterside", "malahide", "Dublin", "92828");
        pubRepository.save(dab);
        System.out.println("No of publishers "+pubRepository.count());
        manoj.getBooks().add(dp);
        dp.getAuthors().add(manoj);


        authorRepository.save(manoj);
        bookRepository.save(dp);

        dp.setPublisher(dab);
        dab.getBooks().add(dp);

        bookRepository.save(dp);
        pubRepository.save(dab);

        System.out.println("spring boot started");
        System.out.println("No of books "+bookRepository.count());
        System.out.println("Publisher has "+dab.getBooks().size());
    }
}

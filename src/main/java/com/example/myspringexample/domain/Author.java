package com.example.myspringexample.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String FirstName;
    private String Secondname;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();


    public Author() {
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSecondname() {
        return Secondname;
    }

    public void setSecondname(String secondname) {
        Secondname = secondname;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Author(String firstName, String secondname) {
        FirstName = firstName;
        Secondname = secondname;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        return id == author.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", Secondname='" + Secondname + '\'' +
                ", books=" + books +
                '}';
    }
}

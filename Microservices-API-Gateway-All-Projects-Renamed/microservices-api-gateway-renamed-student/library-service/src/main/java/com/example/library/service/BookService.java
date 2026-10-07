package com.example.library.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.library.entity.Book;

@Service
public class BookService {
    public List<Book> getBooks() {
        return Arrays.asList(
            new Book(1, "Java Programming", "James Gosling"),
            new Book(2, "Spring Boot", "Craig Walls"),
            new Book(3, "Microservices", "Sam Newman")
        );
    }
}

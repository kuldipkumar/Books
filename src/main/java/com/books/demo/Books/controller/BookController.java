package com.books.demo.Books.controller;

import com.books.demo.Books.entity.Book;
import com.books.demo.Books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/welcome")
    public String welcome(){
        return "You have reached to the Book Store";
    }

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
        bookRepository.save(book);
        return "Book added successfully::"+book.getBookId();
    }

    @DeleteMapping("/deleteBook")
    public String deleteBook(@RequestBody Book book){
        bookRepository.delete(book);
        return "Book deleted " +book.getBookId() + " successfully.";
    }

    //
    @RequestMapping("/books")
    public List<Book> getAllBooks(){
       return bookRepository.findAll();
    }

    @RequestMapping("/book/{id}")
    public Optional<Book> getBooks(@PathVariable Long id){
        return bookRepository.findById(id);
    }

}

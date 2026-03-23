package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.model.Book;

@RestController
public class LibraryController {

    List<Book> bookList = new ArrayList<>();
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Online Library System, thank u";
    }
    @GetMapping("/count")
    public int getCount() {
        return 576;
    }
    @GetMapping("/price")
    public double getPrice() {
        return 2599.99;
    }
    @GetMapping("/books")
    public List<String> getBooks() {

        List<String> books = new ArrayList<>();

        books.add("Java Programming");
        books.add("Spring Boot Guide");
        books.add("Data Structures");
        books.add("Machine Learning Basics");

        return books;
    }
    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        return "Details of book with ID: " + id;
    }
    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return "Searching for book with title: " + title;
    }
    @GetMapping("/author/{name}")
    public String getAuthor(@PathVariable String name) {
        return "Books written by author: " + name;
    }
    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {

        bookList.add(book);

        return "Book added successfully";
    }
    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {

        return bookList;
    }
}
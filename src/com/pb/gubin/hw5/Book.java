package com.pb.gubin.hw5;

public class Book {
    String title; //название
    String author; //автор книги
    int year; //год издания
    public Book(String title, String author) {
this.title = title;
this.author = author;
    }
String getInfo () {
    return "[книга:" + title + ", автор: " + author +",год издания: " + year + "]";
}
}

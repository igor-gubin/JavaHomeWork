package com.pb.gubin.hw5;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        book1.title = "Приключения";
        book2.title = "Словарь";
        book3.title = "Энциклопедия";

        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        Reader reader = new Reader();


    }
}

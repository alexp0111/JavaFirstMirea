package ru.mirea.task3.tests;

import ru.mirea.task2.par1.Book;

import java.time.LocalDate;

public class BookTest {
    public static void main(String[] args){
        Book book = new Book();
        book.setAuthor("James Dashner");
        book.setName("Maze runner");
        book.setNumOfPages(375);
        book.setReleaseDate(LocalDate.of(2014, 9, 14));

        System.out.println(book);
    }
}

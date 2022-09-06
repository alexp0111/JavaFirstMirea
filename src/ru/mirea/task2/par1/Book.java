package ru.mirea.task2.par1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Book {
    private String author;
    private String name;
    private LocalDate releaseDate;
    private int numOfPages;

    public Book(String author, String name, LocalDate releaseDate, int numOfPages) {
        this.author = author;
        this.name = name;
        this.releaseDate = releaseDate;
        this.numOfPages = numOfPages;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", numOfPages=" + numOfPages +
                '}';
    }
}

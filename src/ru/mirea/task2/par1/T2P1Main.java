package ru.mirea.task2.par1;

import ru.mirea.task2.par1.Ball;
import ru.mirea.task2.par1.Book;
import ru.mirea.task2.par1.Shape;

import java.awt.*;
import java.time.LocalDate;

public class T2P1Main {
    public static void main (String[] args){
        Shape circle = new Shape();

        circle.setType("Circle");
        circle.setArea(219.912);
        circle.setColor(new Color(185, 149, 242));

        System.out.println(circle);

        Ball ball = new Ball();
        ball.setPrice(13);
        ball.setRadius(20);
        ball.setColor(new Color(159, 209, 161));

        System.out.println(ball);

        Book book = new Book();
        book.setAuthor("James Dashner");
        book.setName("Maze runner");
        book.setNumOfPages(375);
        book.setReleaseDate(LocalDate.of(2014, 9, 14));

        System.out.println(book);
    }
}

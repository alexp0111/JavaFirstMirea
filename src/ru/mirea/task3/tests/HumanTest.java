package ru.mirea.task3.tests;

import ru.mirea.task3.humans.Hand;
import ru.mirea.task3.humans.Human;
import ru.mirea.task3.humans.Leg;

public class HumanTest {
    public static void main(String[] args){
        Human human = new Human();
        human.setHand(new Hand(10, 1));
        human.setLeg(new Leg(10, 1));
        human.setHand(new Hand(10, 1));

        System.out.println(human);
    }
}

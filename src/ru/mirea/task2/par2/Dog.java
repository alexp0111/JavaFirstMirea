package ru.mirea.task2.par2;

public class Dog {
    private String nickname;
    private int age;

    public Dog(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public Dog() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAgeInHumanFormat(){
        return this.age * 7;
    }

    @Override
    public String toString() {
        return "Dog's nickname is " + nickname
                + " and it's age is " + age
                + " (" + getAgeInHumanFormat() + " in human format);";
    }
}

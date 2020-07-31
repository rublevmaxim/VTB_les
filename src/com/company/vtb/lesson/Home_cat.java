package com.company.vtb.lesson;

public class Home_cat extends Animal {

    public Home_cat(String name) {
        super(name);
    }

    @Override
    public void run(int length_len) {
        if  (200>length_len)
            System.out.println("Кот "+name+" пробежал "+length_len);
        else
            System.out.println("Кот "+name+" сдохла");
    }

    @Override
    public void sweam(int length_len) {
        System.out.println("Коты не умеют плавать");
    }
}

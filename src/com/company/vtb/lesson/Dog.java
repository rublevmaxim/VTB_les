package com.company.vtb.lesson;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }


    @Override
    public void run(int length_len) {
        if  (500>length_len)
            System.out.println(name+" пробежал "+length_len);
        else
            System.out.println("Собака "+name+" сдохла");
    }

    @Override
    public void sweam(int length_len) {
        if  (10>length_len)
            System.out.println("Собака "+name+" пробежал "+length_len);
        else
            System.out.println("Собака "+name+" утонула");
    }
}

package com.company.vtb.lesson;

public abstract class Animal {
    protected String name;

    public Animal(String name){
        this.name=name;
    }

    public abstract void run(int length_len);
    public abstract void sweam(int length_len);




}

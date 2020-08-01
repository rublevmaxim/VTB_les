package com.company.vtb.lesson;

public abstract class Cat extends Animal {
    static int count;
    public Cat(String name, String type, int max_dist_run, int max_dist_swim) {
        super(name, type, max_dist_run, max_dist_swim);
        this.count++;
    }


}

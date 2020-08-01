package com.company.vtb.lesson;

public class Home_cat extends Cat {
    static int count;
    public Home_cat(String name, String type, int max_dist_run, int max_dist_swim) {
        super(name, type, max_dist_run, max_dist_swim);
        this.count++;
    }

    public void swim(int distance) {
        System.out.println("Домашние коты не умеют плавать");
    }
}

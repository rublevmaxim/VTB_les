package com.company.vtb.lesson;

public abstract class Animal {
    protected String name;
    protected String type;
    protected int max_dist_run;
    protected int max_dist_swim;

    static int count;
    public Animal(String name, String type,int max_dist_run, int max_dist_swim){
        this.name=name;
        this.type=type;
        this.max_dist_run=max_dist_run;
        this.max_dist_swim=max_dist_swim;
        this.count++;
    }

    public void run(int distance){

        if (distance<0)
        {
            System.out.println("Дистанция должна быть больше 0");
            throw new IllegalArgumentException("Дистанция должна быть больше 0");
        }
        else if (max_dist_run==0){
            System.out.println(type+" "+name+" не может пробежать "+distance);
            return;
        }
        else if (distance<=max_dist_run){
            System.out.println(type+" "+name+" пробежал "+distance);
        }else{
            System.out.println(type+" "+name+" не может пробежать "+distance);
        }
    }

    public void swim(int distance){

        if (distance<0)
        {
            System.out.println("Дистанция должна быть больше 0");
            throw new IllegalArgumentException("Дистанция должна быть больше 0");
        }
        else if (max_dist_swim==0){
            System.out.println(type+" "+name+" не может плыть");
            return;
        }
        else if (distance<=max_dist_swim){
            System.out.println(type+" "+name+" проплыл "+distance);
        }else{
            System.out.println(type+" "+name+" не может проплыть "+distance);
        }
    }



}

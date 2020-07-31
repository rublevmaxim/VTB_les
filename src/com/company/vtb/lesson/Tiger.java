package com.company.vtb.lesson;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }
    @Override
    public void run(int length_len) {
            System.out.println("Тигр "+name+" пробежал "+length_len);
    }

    @Override
    public void sweam(int length_len) {
        System.out.println("Тигр " + name + " проплыл " + length_len);
    }
}

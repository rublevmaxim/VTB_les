package com.company.vtb.lesson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog=new Dog("Бобик","Пёс",500,10);
        //dog.run(500);
       // dog.swim(100);

        Home_cat home_cat=new Home_cat("Барсик","Домашний кот",200,0);
       // home_cat.run(400);
       // home_cat.swim(50);

        Tiger tiger=new Tiger("Симба","Тигр",1000,900);
       // tiger.run(900);
        //tiger.swim(700);

        Animal[] animal1={dog,home_cat,tiger};

        /*Animal[] animal2={new Dog("Бобик","Пёс",500,10),
                          new Home_cat("Барсик","Домашний кот",200,0),
                          new Tiger("Шеркхан","Тигр",1000,900)};
        */

        System.out.println("Стар:");
        for(Animal zver:animal1){
            if (zver instanceof Dog){
                zver.run(700);
                zver.swim(-1);
            }else
            {
            zver.run(700);
            zver.swim(700);}
            /*if (zver instanceof Home_cat) count_cat++;
            if (zver instanceof Dog) count_dog++;
            if (zver instanceof Tiger) count_tiger++;*/
        }

        System.out.println("Всего зверей "+ Animal.count);
        System.out.println("Из них: ");
        System.out.println("Собаки "+ Dog.count);
        System.out.println("Кошки  "+ Cat.count+":");
        System.out.println("Домашние коты  "+ Home_cat.count);
        System.out.println("Тигры  "+ Tiger.count);


    }
}

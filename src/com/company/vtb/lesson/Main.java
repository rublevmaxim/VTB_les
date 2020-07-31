package com.company.vtb.lesson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int lenght_len=500;
        int count_dog=0;
        int count_cat=0;
        int count_tiger=0;
        int count_animal=0;
      Home_cat home_cat=new Home_cat("Барсик");
      Dog dog=new Dog("Бобик");
      Tiger tiger=new Tiger("Шархан");

      dog.run(lenght_len);
      home_cat.sweam(lenght_len);
      tiger.sweam(lenght_len);

        Animal[] animal1={dog,home_cat,tiger};

        Animal[] animal2={new Dog("Тузик"),new Home_cat("Рыжик"),new Tiger("Симба")};
        System.out.println("Стар:");
        for(Animal zver:animal1){
            zver.run(700);
            zver.sweam(700);
            count_animal++;
            if (zver instanceof Home_cat) count_cat++;
            if (zver instanceof Dog) count_dog++;
            if (zver instanceof Tiger) count_tiger++;
        }
        System.out.println("Всего животных: "+count_animal+"из них это "
                                            +count_cat+" коты, "+
                                            +count_dog+" собаки, "+
                                            +count_tiger+" тигры. ");

    }
}

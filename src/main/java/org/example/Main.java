package org.example;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Random rnd = new Random(System.currentTimeMillis());
        int sex = rnd.nextInt(3);
                if (sex < 1) {
            System.out.println("Вы женщина");}
        else if (sex>1){
                    System.out.println("Животное");}
        else {
                    System.out.println("Вы мужчина");
        }

        Random rnd2 = new Random(System.currentTimeMillis());
        int number = rnd2.nextInt(100);
        System.out.println("Возраст равен "+ number);
        if (number > 17) {
            System.out.println("Совершеннолетний");}
        else {
            System.out.println("Несовершеннолетний ");
        }
    }
    }
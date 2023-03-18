package org.example;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Random rnd = new Random(System.currentTimeMillis());
        int sex = rnd.nextInt(3);
                if (sex < 1) {
            System.out.println("Вы настоящая женщина");}
        else if (sex>1){
                    System.out.println("Вы просто животное");}
        else {
                    System.out.println("Вы настоящий мужчина");
        }

        Random rnd2 = new Random(System.currentTimeMillis());
        int number = rnd2.nextInt(100);
        System.out.println("Возраст равен "+ number);
        if (number > 17) {
            System.out.println("ого, уже совершеннолетний ");}
        else {
            System.out.println("хаха еще несовершеннолетний   ");
        }
    }
    }
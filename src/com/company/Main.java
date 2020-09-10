package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(walking(25, 5));
        System.out.println(walking(34, 36));
        System.out.println(walking(97, 12));
        System.out.println(walking(43, -10));

        int result = generateRandomAge();
        System.out.println(walking(result, 23));
    }

    public static String walking(int age, int temp) {
        if (age > 20 && age < 25 && temp > -20 && temp < 30) {
            return "1- Можно идти гулять";
        }
        if (age < 20 && temp > 0 && temp < 28) {
            return "2- можно идти гулять";
        }
        if (age > 45 && temp > -10 && temp < 25) {
            return "3- можно идти гулять";
        } else {
            return "4- Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random vozrast = new Random();
        int ageDo = 100;
        int randomAge = vozrast.nextInt(ageDo);
        System.out.println("метод случайных чисел " + randomAge);
        return randomAge;
    }
}



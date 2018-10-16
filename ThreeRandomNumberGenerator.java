package lv.javaguru.demo;

import java.util.Random;

public class ThreeRandomNumberGenerator {
    public static void main(String [] args){
        Random randomGenerator = new Random();
        int firstRandomNumber =
                randomGenerator.nextInt(101);
        int secondRandomNumber =
                randomGenerator.nextInt(101);
        int thirdRandomNumber =
                randomGenerator.nextInt(101);
        int sumResult = firstRandomNumber + secondRandomNumber + thirdRandomNumber;
        System.out.println(firstRandomNumber);
        System.out.println(secondRandomNumber);
        System.out.println(thirdRandomNumber);
        System.out.println(sumResult);
    }
}
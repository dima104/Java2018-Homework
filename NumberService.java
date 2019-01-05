package lv.javaguru.demo.java;

public class NumberService {
    int sumInRange(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
            System.out.println("the total sum is " + sum);
        }
        return sum;
    }

    int getEvenNumberCount(int from, int to) {
        int evenNumberCounter = 0;
        for (int i = from; i < to; i++) {
            if (i % 2 == 0) {
                evenNumberCounter++;
            }
        }
        return evenNumberCounter;
    }
}
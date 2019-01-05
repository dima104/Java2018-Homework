package lv.javaguru.demo.java;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest testRunner = new ArrayServiceTest();
        testRunner.needCreateArray();
        testRunner.needFillArrayWithRandomNumbers();
        testRunner.needFindAverageNumberInArray();
    }

    void needCreateArray() {
        ArrayService victim = new ArrayService();
        int expectedResult = 8;
        int actualREuslt = victim.createArray(8).length;
        if (expectedResult == actualREuslt) {
            System.out.println("NeedCreateArray test: Ok");
        } else {
            System.out.println("NeedCreateArray test:FAILED");
        }
    }

    void needFillArrayWithRandomNumbers() {
        ArrayService victim = new ArrayService();
        int[] array = new int[8];
        victim.printArrayToXConsole(array);
        victim.fillArrayWithRandomNumbers(array);
        System.out.println();
    }

    void needFindAverageNumberInArray() {
        ArrayService victim = new ArrayService();
        double[] array = {2, 4, 6};
        double expectedResult = 4;
        double actualResult = victim.findAverageNumberInArray(array);
        if (expectedResult == actualResult) {
            System.out.println("needFindAverageNumberInArray: OK");
        } else {
            System.out.println("needFindAverageNumberInArray: FAILED");
        }
    }
}

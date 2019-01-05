package lv.javaguru.demo.java;

public class TVTest {
    public static void main(String[] args) {
        TVTest testRunner = new TVTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
    }

    void test1() {
        TV victim = new TV();
        victim.turnOn();

        boolean expected = true;
        boolean actual = victim.isTurnedOn();
        if (expected == actual) {
            System.out.println("test 1: OK");
        } else {
            System.out.println("test 1:FAILED");
        }
    }

    void test2() {
        TV victim = new TV();
        String expected = "Current Channel: 0, turnedOn: false";
        String actual = victim.toString();
        if (expected == actual) {
            System.out.println("test 2:OK");
        } else {
            System.out.println("test 2: FAILED. Expected:  " + expected + "Actual:  " + actual);
        }
    }

    void test3() {
        TV victim = new TV();
        victim.turnOn();
        victim.nextChannel();
        victim.nextChannel();
        TV expectedResult = new TV(true, 2);
        if (victim.equals(expectedResult)) {
            System.out.println("test 3: OK");
        } else {
            System.out.println("Test 3:FAILED. Expected:   " + expectedResult + "Actual:  " + victim);
        }
    }
}

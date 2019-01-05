package lv.javaguru.demo.java;

public class NumberServiceTest {
    public static void main(String[] args) {
        NumberServiceTest testRunner = new NumberServiceTest();
        testRunner.test1();
        testRunner.test2();
    }

    void test1() {
        NumberService victim = new NumberService();
        int actual = victim.sumInRange(2, 10);
        int expected = 44;
        if (expected == actual) {
            System.out.println("test 1:  is Good");
        } else {
            System.out.println("test 1: FAILED. Expected result:" + expected + "  Actual result:" + actual);
        }
    }

    void test2() {
        NumberService victim = new NumberService();
        int actual = victim.getEvenNumberCount(4, 12);
        int expected = 4;
        if (expected == actual) {
            System.out.println("test 2:  is Good");
        } else {
            System.out.println("test 2: FAILED. Expected result:" + expected + "actual result:" + actual);
        }
    }
}

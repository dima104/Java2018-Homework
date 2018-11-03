package lv.javaguru.demo.java;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest testRunner = new LightColorDetectorTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
        testRunner.test4();
        testRunner.test5();
        testRunner.test6();
        testRunner.test7();
    }

    void test1() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(400);
        compareResult(result.equals("Violet:"), "test1");
    }

    void test2() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(470);
        compareResult(result.equals("Blue:"), "test2");
    }

    void test3() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(500);
        compareResult(result.equals("Green:"), "test3");
    }

    void test4() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(580);
        compareResult(result.equals("Yellow:"), "test4");
    }

    void test5() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(600);
        compareResult(result.equals("Orange:"), "test5");
    }

    void test6() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(700);
        compareResult(result.equals("Red:"), "test6");
    }

    void test7() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(960);
        compareResult(result.equals("Light is not visible"), "test7");
    }

    void compareResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + "Correct");
        } else {
            System.out.println(testName + "Not correct");
        }
    }
}

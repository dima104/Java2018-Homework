package lv.javaguru.demo.java;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    Set<String> words = new HashSet<>();

    public void addWords(String cars) {
        if (cars.length() > 0)
            words.add(cars);
    }

    public int getUniqueWords() {
        return words.size();
    }

    public void printToConsole() {
        System.out.println("Vocabulary contains such a words: \n" + words);
    }

    void test1() {
        UniqueWordVocabulary wordTest = new UniqueWordVocabulary();
        int expected = 3;
        int actual = getUniqueWords();
        check(actual, expected, "test1");
    }

    void check(int actual, int expected, String TestName) {
        if (actual == expected) {
            System.out.println(TestName + "   has passed");
        } else {
            System.out.println(TestName + "   has FAILED");
            System.out.println("Expected" + expected + "Actual" + actual);
        }
    }
}

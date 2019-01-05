package lv.javaguru.demo.java;

public class UniqueWordVocabularyTest {
    public static void main(String[] args) {
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        uniqueWordVocabulary.addWords("Volvo");
        uniqueWordVocabulary.addWords("Subaru");
        uniqueWordVocabulary.addWords("Audi");
        uniqueWordVocabulary.addWords("");
        uniqueWordVocabulary.getUniqueWords();
        System.out.println(uniqueWordVocabulary.getUniqueWords());
        uniqueWordVocabulary.printToConsole();
        uniqueWordVocabulary.test1();
    }
}

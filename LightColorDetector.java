package lv.javaguru.demo.java;

public class LightColorDetector {
    public String detect(int wavelenght) {
        if (wavelenght >= 380 && wavelenght < 450) {
            return "Violet:";
        }
        if (wavelenght >= 450 && wavelenght < 495) {
            return "Blue:";
        }
        if (wavelenght >= 495 && wavelenght < 570) {
            return "Green:";
        }
        if (wavelenght >= 570 && wavelenght < 590) {
            return "Yellow:";
        }
        if (wavelenght >= 590 && wavelenght < 620) {
            return "Orange:";
        }
        if (wavelenght >= 620 && wavelenght < 750) {
            return "Red:";
        }
        return "Light is not visible";
    }
}

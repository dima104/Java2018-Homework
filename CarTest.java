package lv.javaguru.demo.java;

public class CarTest {
    public static void main(String[]args){
        Car firstcar=new Car();
        firstcar.setColour("Red");
        firstcar.setBrand("Lamborghini");
        firstcar.setYear(2019);

        System.out.println("Car's colour:"+ firstcar.getColour());
        System.out.println("Car's brand:"+firstcar.getBrand());
        System.out.println("Car's year:"+firstcar.getYear());

    }
}

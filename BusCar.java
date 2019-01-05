package lv.javaguru.demo.java;

public class BusCar extends Car1 {
    public void takeMoneyFromPeople() {
        System.out.println("This car is driving business");
    }

    @Override
    public String toString() {
        return "BusCar{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

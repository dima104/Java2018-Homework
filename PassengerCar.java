package lv.javaguru.demo.java;

public class PassengerCar extends Car1 {
    public void haul(){
        System.out.println("This car can take up to 5 persons");
    }

    @Override
    public String toString() {
        return "PassengerCar{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

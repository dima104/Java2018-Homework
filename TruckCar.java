package lv.javaguru.demo.java;

public class TruckCar extends Car1 {
    public void drift() {
        System.out.println("This insane car can make most powerfull drift");
    }

    @Override
    public String toString() {
        return "TruckCar{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

package lv.javaguru.demo.java;

public class Car1Test {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.drive();
        PassengerCar passengerCar = new PassengerCar();
        passengerCar.drive();
        TruckCar truckCar = new TruckCar();
        truckCar.drive();
        BusCar busCar = new BusCar();
        busCar.drive();

        System.out.println();

        passengerCar.haul();
        truckCar.drift();
        busCar.takeMoneyFromPeople();

        System.out.println();

        Car1[] cars = new Car1[]{new PassengerCar(), new TruckCar(), new BusCar()};
        for (Car1 cr : cars) {
            cr.drive();
        }
    }
}

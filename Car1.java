package lv.javaguru.demo.java;

class Car1 {

    public void drive() {
        System.out.println("This car is driving well");
    }

    @Override
    public String toString() {
        return "Car1{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

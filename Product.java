package lv.javaguru.demo.java;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public double getRegularPrice(){
        return regularPrice;
    }
    public void setRegularPrice(double regularPrice){
        this.regularPrice=regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double getCalculateActualPrice(){
        return regularPrice*(1-discount);
    }
}

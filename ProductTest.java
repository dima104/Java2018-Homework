package lv.javaguru.demo.java;

public class ProductTest {
    public static void main(String [] args){
        Product firstProduct=new Product();
        firstProduct.setName("Pineapple");
        firstProduct.setRegularPrice(2.40);
        firstProduct.setDiscount(0.3);
        System.out.println("Name:"+firstProduct.getName());
        System.out.println("Regular Price:"+firstProduct.getRegularPrice());
        System.out.println("Discount:"+firstProduct.getDiscount());
        System.out.println("Calculated price:"+firstProduct.getCalculateActualPrice());
        System.out.println("Product's name:"+firstProduct.getName()+",  Product's regular price:"+ firstProduct.getRegularPrice()+",  Product's discount:"+firstProduct.getDiscount()+",  Product's actual price:"+firstProduct.getCalculateActualPrice());
    }
}

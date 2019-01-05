package lv.javaguru.demo.java;

public class UserValidationServiceTest {
    public static void main(String[] args) {

        User user = new User("Dmitrijs", "Lebedevs", 24);
        User user1 = new User("Roberts", "Berzins", 35);
        User user2 = new User("Kendrick", "Lamar", 31);

        UserValidationService service = new UserValidationService();

        service.validate(user);
        service.validate(user1);
        service.validate(user2);

        System.out.println("Well done");
    }
}

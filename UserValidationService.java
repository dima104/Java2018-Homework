package lv.javaguru.demo.java;

public class UserValidationService {
    public void validate(User user) {

        if (user.age < 0 || user.age > 120) {
            throw new ValidationException("The age must be more than 0 and not more 120");
        }

        if (user.name.length() < 3 || user.name.length() > 15) {
            throw new ValidationException("Name should have at least 3 and not more than 15 letters");
        }

        if (user.lastName.length() < 3 || user.lastName.length() > 15) {
            throw new ValidationException("Lastname should have at least 3 and not more than 15 letters");
        }
    }
}

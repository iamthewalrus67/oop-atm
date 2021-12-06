package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("John")
                .lastName("Mayer")
                .age(45)
                .gender("Male")
                .occupation("Singer")
                .occupation("Songwriter")
                .occupation("Guitarist")
                .weight(80)
                .build();

        System.out.println(user.toString());
    }
}

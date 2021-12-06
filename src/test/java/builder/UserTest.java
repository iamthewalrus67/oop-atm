package builder;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @org.junit.jupiter.api.Test
    void testToString() {
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

        assertEquals("User(firstName=John, lastName=Mayer, occupations=[Singer, Songwriter, Guitarist], gender=Male, age=45, weight=80)", user.toString());
    }
}
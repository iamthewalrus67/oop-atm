package atm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    ATM atm;
    ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        atm = new ATM();
    }

    @AfterEach
    void tearDown() {
        System.setOut(System.out);
    }

    @Test
    void process() {
        atm.process(125);
        assertEquals("Please receive 1 of 5 UAH bills\n" +
                "Please receive 6 of 20 UAH bills", outputStreamCaptor.toString().trim());
    }
}
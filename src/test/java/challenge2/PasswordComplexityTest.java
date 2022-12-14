package challenge2;

import challenge2.PasswordComplexity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordComplexityTest {

    @Test
    public void isPasswordComplex_true() {
        Assertions.assertAll(
                () -> assertTrue(PasswordComplexity.isPasswordComplex("Happy12")),
                () -> assertTrue(PasswordComplexity.isPasswordComplex("1SarahL ength")),
                () -> assertTrue(PasswordComplexity.isPasswordComplex("Password12")),
                () -> assertTrue(PasswordComplexity.isPasswordComplex("2PassW@ord1")),
                () -> assertTrue(PasswordComplexity.isPasswordComplex("01Sall#y9"))

        );
    }

    @Test
    public void isPasswordComplex_false() {
        Assertions.assertAll(
                () -> assertFalse(PasswordComplexity.isPasswordComplex("12aB ")),
                () -> assertFalse(PasswordComplexity.isPasswordComplex("Ab112")),
                () -> assertFalse(PasswordComplexity.isPasswordComplex("happy")),
                () -> assertFalse(PasswordComplexity.isPasswordComplex("happy_1")),
                () -> assertFalse(PasswordComplexity.isPasswordComplex("p assword12")),
                () -> assertFalse(PasswordComplexity.isPasswordComplex("Sur18")),
                () -> assertFalse(PasswordComplexity.isPasswordComplex(""))
        );
    }
}

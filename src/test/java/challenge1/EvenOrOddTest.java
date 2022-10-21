package challenge1;

import challenge1.EvenOrOdd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenOrOddTest {

    @Test
    public void isEven_true() {
        Assertions.assertAll(
                () -> assertTrue(EvenOrOdd.isEven(0)),
                () -> assertTrue(EvenOrOdd.isEven(2)),
                () -> assertTrue(EvenOrOdd.isEven(4)),
                () -> assertTrue(EvenOrOdd.isEven(6)),
                () -> assertTrue(EvenOrOdd.isEven(8)),
                () -> assertTrue(EvenOrOdd.isEven(-20)),
                () -> assertTrue(EvenOrOdd.isEven(100)),
                () -> assertTrue(EvenOrOdd.isEven(-46))
                );
    }

    @Test
    public void isEven_false() {
        Assertions.assertAll(
                () -> assertFalse(EvenOrOdd.isEven(1)),
                () -> assertFalse(EvenOrOdd.isEven(3)),
                () -> assertFalse(EvenOrOdd.isEven(5)),
                () -> assertFalse(EvenOrOdd.isEven(7)),
                () -> assertFalse(EvenOrOdd.isEven(9)),
                () -> assertFalse(EvenOrOdd.isEven(-11)),
                () -> assertFalse(EvenOrOdd.isEven(93)),
                () -> assertFalse(EvenOrOdd.isEven(-75))
        );
    }
}

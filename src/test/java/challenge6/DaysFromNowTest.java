package challenge6;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DaysFromNowTest {

    @Test
    public void calculateHundredDaysFromNow() {
        LocalDate date1 = LocalDate.of(2020, 1, 1);
        assertEquals(LocalDate.of(2020, 4, 10), DaysFromNow.calculateHundredDaysFromNow(date1));
    }
}

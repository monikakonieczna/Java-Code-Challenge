package challenge5;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void personAttributes_firstName() {
        //given
        Person person = new Person("Monika", "Konieczna", 27);
        assertEquals("Monika", person.getFirstname());
        //when
        person.setFirstname("Sally");
        //then
        assertEquals("Sally", person.getFirstname());
    }

    @Test
    public void personAttributes_lastName() {
        //given
        Person person = new Person("Monika", "Konieczna", 27);
        assertEquals("Konieczna", person.getLastName());
        //when
        person.setLastName("Kowalska");
        //then
        assertEquals("Kowalska", person.getLastName());
    }

    @Test
    public void personAttributes_age() {
        //given
        Person person = new Person("Monika", "Konieczna", 27);
        assertEquals(27, person.getAge());
        //when
        person.setAge(28);
        //then
        assertEquals(28, person.getAge());
    }

    @Test
    public void personAttributes_introduceYourself() {
        //given
        ByteArrayOutputStream printOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(printOut));
        Person person = new Person("Ruby",
                "Wilson", 56);
        //when
        person.introduceYourself();
        //then
        assertEquals("Hi, my name is Ruby Wilson and I'm 56\n",
                printOut.toString());
        System.setOut(System.out);
    }
}

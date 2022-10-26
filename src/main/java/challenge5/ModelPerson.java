package challenge5;

public class ModelPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Ron", "Wesley", 17);
        Person person2 = new Person("Harry", "Potter", 17);
        Person person3 = new Person("Hermiona", "Granger", 17);

        person1.introduceYourself();
        person2.introduceYourself();
        person3.introduceYourself();
    }
}

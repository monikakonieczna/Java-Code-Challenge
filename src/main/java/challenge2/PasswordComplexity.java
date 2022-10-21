package challenge2;

import java.util.Scanner;

public class PasswordComplexity {

    public static boolean isPasswordComplex(String password) {
        return password.length() >= 6 &&
                password.matches(".*[a-z].*")  && password.matches(".*[A-Z].*") && password.matches(".*\\d.*");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? " +
                isPasswordComplex(userInput));
    }
}


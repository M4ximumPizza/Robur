package mi.m4x.project.robur;

import java.util.Scanner;

public class PasswordManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Check password strength");
        System.out.println("2. Generate password");
        int option = scanner.nextInt();

        if(option == 1){
            scanner.nextLine(); // Consume newline character left from nextInt()
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            PasswordChecker checker = new PasswordChecker();
            int score = checker.calculatePasswordStrength(password);
            String strength = checker.determineStrength(score);

            System.out.println("Password strength: " + strength);
        } else if(option == 2) {
            System.out.print("Enter the length of the password: ");
            int length = scanner.nextInt();

            PasswordGenerator generator = new PasswordGenerator();
            String password = generator.generateRandomPassword(length);
            System.out.println("Generated password: " + password);

            // Copy password to clipboard
            PasswordCopier copier = new PasswordCopier();
            copier.copyToClipboard(password);
            System.out.println("Password copied to clipboard.");
        } else {
            System.out.println("Invalid option selected.");
        }
    }
}


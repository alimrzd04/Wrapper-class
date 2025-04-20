package org.example;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Login lg = new Login();
        lg.login();
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Email daxil edin: ");
            String emailInput = scanner.nextLine();
            Email email = new Email(emailInput);

            System.out.print("Yas daxil edin: ");
            int ageInput = scanner.nextInt();
            scanner.nextLine();
            Age age = new Age(ageInput);

            System.out.print("Telefon nomresini daxil edin: ");
            String num = scanner.nextLine();
            Number number = new Number(num);

            System.out.println("Giriş uğurla başa çatdı!");
            System.out.println("Email: " + emailInput);
            System.out.println("Yaş: " + ageInput);
            System.out.println("Telefon: " + num);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


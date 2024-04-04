/*
5) Faça um programa em Java que receba a idade de uma pessoa em anos, meses e dias e informe quantos
dias aproximadamente ele já viveu.
*/

import java.util.Scanner;

public class TimeToDays {
    public static void main(String[] args) {

        int age, month, days, amountDays;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age (years): ");
        age = scanner.nextInt();

        System.out.print("Enter months: ");
        month = scanner.nextInt();

        System.out.print("Enter days: ");
        days = scanner.nextInt();

        amountDays = (age * 365) + (month * 30) + days;

        System.out.println("You lived for " + amountDays + " days");

    }
}

package lista1.lpa.exec;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ammount, tip, tax;

        System.out.print("Enter ammount: ");
        ammount = scanner.nextDouble();

        System.out.print("Enter tax: ");
        tax = scanner.nextDouble();

        tip = (ammount * tax)/100;
        System.out.println("Tip is " + tip);
    }
}

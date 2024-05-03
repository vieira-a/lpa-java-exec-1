package lista1.lpa.exec;

import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celcius, fahrenheit;

        System.out.print("Enter celcius: ");
        celcius = scanner.nextDouble();

        fahrenheit = (celcius * 1.8) + 32;

        String message = String.format("%.1fºC is %.1fºF", celcius, fahrenheit);
        System.out.println(message);
    }
}
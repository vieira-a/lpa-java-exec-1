package lista1.lpa.exec;

import java.util.Scanner;

public class TimeToSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hours: ");
        int hours = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter minutes: ");
        int minutes = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter seconds: ");
        int seconds = Integer.parseInt(scanner.nextLine());

        scanner.close();

        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        System.out.println("Total seconds: " + totalSeconds);


    }
}

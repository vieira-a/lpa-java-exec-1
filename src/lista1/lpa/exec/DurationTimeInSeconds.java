package lista1.lpa.exec;/*
Faça um programa em Java que receba as horas de início e fim de uma atividade (expressas em horas, minutos e segundos) e ao final informe o tempo de duração da atividade.
Dica: transforme as horas de início e fim em segundos, realize a subtração e em seguida volte a transformar em horas, minutos e segundos.
*/

import java.util.Scanner;

public class DurationTimeInSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startHours, startMinutes, startSeconds, endHours, endMinutes, endSeconds, amountHoursInSeconds, amountMinutesInSeconds, amountSeconds, amountHours, amountMinutes;

        System.out.print("Enter init hour: ");
        startHours = sc.nextInt();

        System.out.print("Enter start minutes: ");
        startMinutes = sc.nextInt();

        System.out.print("Enter start seconds: ");
        startSeconds = sc.nextInt();

        System.out.print("Enter end hour: ");
        endHours = sc.nextInt();

        System.out.print("Enter end minutes: ");
        endMinutes = sc.nextInt();

        System.out.print("Enter end seconds: ");
        endSeconds = sc.nextInt();

        amountHoursInSeconds = Math.abs((startHours * 3600) - (endHours * 3600));
        amountMinutesInSeconds = Math.abs((startMinutes * 60) - (endMinutes * 60));
        amountSeconds = Math.abs(startSeconds - endSeconds);

        amountHours = Math.abs(amountHoursInSeconds / 3600);
        amountMinutes = Math.abs(amountMinutesInSeconds / 60);

        System.out.println("Time of activity: " + amountHours + ":" + amountMinutes + ":" + String.format("%02d", amountSeconds));

    }
}

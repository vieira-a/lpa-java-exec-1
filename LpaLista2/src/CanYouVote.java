/*
Escreva um algoritmo em Java para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá
ou não votar este ano (não é necessário considerar o mês em que ela nasceu).
* */

import java.util.Scanner;

public class CanYouVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentYear = 2024, voteAge = 16, yourAge;

        System.out.print("Your birth year: ");
        int birthYear = sc.nextInt();

        yourAge = currentYear - birthYear;
        if(yourAge >= voteAge) {
            System.out.println("You can vote :D");
        } else {
            System.out.println("You cannot vote yet :(");
        }

    }
}
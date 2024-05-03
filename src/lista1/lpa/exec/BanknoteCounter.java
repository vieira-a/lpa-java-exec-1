package lista1.lpa.exec;/*
Faça um programa em Java que simule um caixa eletrônico para saque. O algoritmo deve receber um valor
monetário (o valor deve ser recebido como um valor inteiro) e informar quantas notas de R$50,00, R$10,00,
R$5,00 e R$1,00 devem ser entregues ao usuário usando o mínimo de notas possível.
*/

import java.util.Scanner;

public class BanknoteCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value, note50, note10, note5, note1, rest;

        System.out.print("Enter a value: ");
        value = scanner.nextInt();

        note50 = value / 50;
        rest = value % 50;

        note10 = rest / 10;
        rest = rest % 10;

        note5 = rest / 5;
        rest = rest % 5;

        note1 = rest;

        System.out.println("50 notes: "+ note50);
        System.out.println("10 notes: "+ note10);
        System.out.println("5 notes: "+ note5);
        System.out.println("1 notes: "+ note1);
    }
}

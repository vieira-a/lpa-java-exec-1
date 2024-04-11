/*
Escreva um algoritmo em Java para determinar se um número A é divisível por um outro número B.
Esses valores devem ser fornecidos pelo usuário.
*/

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fist number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        if(firstNumber % secondNumber == 0) {
            System.out.println(firstNumber + " is divisible by " + secondNumber + " :D");
        } else {
            System.out.println(firstNumber + " is not divisible by " + secondNumber + " :(");
        }


    }
}

/*
Faça um programa em Java que receba o primeiro e o segundo termos de uma Progressão Aritmética e um
número que represente qual termo da PA o usuário deseja saber. O algoritmo deve calcular o termo
solicitado pelo usuário e mostrar na tela.
razao = diferenca entre os dois termos consecutivos
 */

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber, secondNumber, reason, term, nextTerm;

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextInt();

        System.out.print("Enter the term: ");
        term = scanner.nextInt();

        //get absolute value
        reason = Math.abs(firstNumber - secondNumber);

        nextTerm = firstNumber + ((term - 1) * reason);
        System.out.println("Next term: " + nextTerm);

    }
}

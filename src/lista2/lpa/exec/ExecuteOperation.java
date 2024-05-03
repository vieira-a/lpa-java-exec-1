/*
Escreva um programa para ler 2 valores inteiros e uma das seguintes operações a serem
executadas (codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
Calcular e escrever o resultado dessa operação sobre os dois valores lidos.
*/

package lista2.lpa.exec;

import java.util.Scanner;

public class ExecuteOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int operation;

        System.out.println("Chose an option");
        System.out.println("1 - Add | 2 - Subtract | 3 - Multiply | 4 - Divide");
        operation = sc.nextInt();

        System.out.println("Enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Enter the second number: ");
        int second = sc.nextInt();

        switch (operation) {
            case 1:
                result = first + second;
                break;
            case 2:
                result = first - second;
                break;
            case 3:
                result = first * second;
                break;
            case 4:
                result = first / second;
                break;
            default:
                System.out.println("Invalid operation");
        }

        System.out.println("Result: " + result);
    }
}

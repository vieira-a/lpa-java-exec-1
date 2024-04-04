/*
4) Faça um programa em Java que leia o valor do salário mínimo e o valor do salário de uma pessoa. Calcular
e imprimir quantos salários mínimos ela ganha.
* */

import java.util.Scanner;

public class AmmountSalaryCalculator {
    public static void main(String[] args) {

        double salaryValue, receivedSalary, ammountSalary;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the salary value: ");
        salaryValue = scanner.nextDouble();

        System.out.println("Enter your received salary: ");
        receivedSalary = scanner.nextDouble();

        ammountSalary = receivedSalary / salaryValue;

        System.out.println("Ammount salary: " + String.format("%.2f", ammountSalary));
    }
}


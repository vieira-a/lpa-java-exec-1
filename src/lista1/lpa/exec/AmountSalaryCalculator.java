package lista1.lpa.exec;/*
4) Faça um programa em Java que leia o valor do salário mínimo e o valor do salário de uma pessoa. Calcular
e imprimir quantos salários mínimos ela ganha.
* */

import java.util.Scanner;

public class AmountSalaryCalculator {
    public static void main(String[] args) {

        double salaryValue, receivedSalary, amountSalary;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the salary value: ");
        salaryValue = scanner.nextDouble();

        System.out.println("Enter your received salary: ");
        receivedSalary = scanner.nextDouble();

        amountSalary = receivedSalary / salaryValue;

        System.out.println("Amount salary: " + String.format("%.2f", amountSalary));
    }
}


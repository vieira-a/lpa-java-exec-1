/*
Faça um programa em Java que receba 3 notas de um aluno e seus respectivos pesos, calcule e informe a
média ponderada.
*/

import java.util.Scanner;

public class WeightedAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double score1, score2, score3, totalScore, weight1, weight2, weight3, totalWeight, weightedAverage;

        System.out.println("Enter score 1: ");
        score1 = scanner.nextDouble();

        System.out.println("Enter score 2: ");
        score2 = scanner.nextDouble();

        System.out.println("Enter score 3: ");
        score3 = scanner.nextDouble();

        System.out.println("Enter weight 1: ");
        weight1 = scanner.nextDouble();

        System.out.println("Enter weight 2: ");
        weight2 = scanner.nextDouble();

        System.out.println("Enter weight 3: ");
        weight3 = scanner.nextDouble();

        totalScore = (score1*weight1+score2*weight2+score3*weight3);
        totalWeight = (weight1+weight2+weight3);
        weightedAverage = totalScore / totalWeight;

        System.out.println("Weighted average " + String.format("%.2f", weightedAverage));

    }
}
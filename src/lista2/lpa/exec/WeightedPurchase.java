package lista2.lpa.exec;/*
As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.
Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra.
*/

import java.util.Scanner;

public class WeightedPurchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double appleUnitNormalValue = 0.30, appleUnitPromotionValue = 0.25, amountPurchase;

        System.out.println("How many apples: ");
        int totalApples = sc.nextInt();

        if(totalApples >= 12) {
            amountPurchase = totalApples * appleUnitPromotionValue;
        } else {
            amountPurchase = totalApples * appleUnitNormalValue;
        }

        System.out.println("Amount purchase: " + amountPurchase);
    }
}

/*
Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:feminino
2:masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal,
utilizando as seguintes fórmulas:
    – para homens : (72.7 * h) – 58
    – para mulheres : (62.1 * h) – 44.7
*/

package lista2.lpa.exec;

import java.util.Scanner;

public class IdealWeight {
    public static void main(String[] args) {
        double idealWeight = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Chose an option");
        System.out.println("1 - Female | 2 - Male: ");
        int option = sc.nextInt();

        System.out.println("Enter your height: ");
        double height = sc.nextDouble();

        if(option == 1){
            idealWeight = (62.1 * height) - 44.7;
        } else if(option == 2){
            idealWeight = (72.7 * height) - 58;
        }

        System.out.println("Your ideal weight is: " + String.format("%.2f", idealWeight));

    }
}

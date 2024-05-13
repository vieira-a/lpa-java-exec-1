/*
Escreva um programa que leia a idade de 2 homens e 2 mulheres (considere que a idade dos
homens será sempre diferente, assim como das mulheres). Calcule e escreva a soma das
idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
novo com a mulher mais velha.
* */

package lista2.lpa.exec;

import java.util.Scanner;

public class AgeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter man's one age: ");
        int ageMan1 = sc.nextInt();
        System.out.println("Enter man's two age: ");
        int ageMan2 = sc.nextInt();
        System.out.println("Enter woman's one age: ");
        int ageWoman1 = sc.nextInt();
        System.out.println("Enter woman's two age: ");
        int ageWoman2 = sc.nextInt();

        if(ageMan1 > ageMan2){
            if(ageWoman1 > ageWoman2){
                System.out.println("Older man + younger woman: " + (ageMan1 + ageWoman2));
                System.out.println("Younger man + older woman: " + (ageMan2 * ageWoman1));
            } else {
                System.out.println("Older man + younger woman: " + (ageMan1 + ageWoman1));
                System.out.println("Younger man + older woman: " + (ageMan2 * ageWoman2));
            }
        } else {
            System.out.println("Older man + younger woman: " + (ageMan2 + ageWoman2));
            System.out.println("Younger man + older woman: " + (ageMan1 * ageWoman1));
        }
    }
}
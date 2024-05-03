/*
* Digitar um numero
* Somar numeros impares de acordo com o numero digitado
* Digitou 3, soma os 3 primeiros impares
* */

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(i);
            sum += i+i+1;
        }
        System.out.println(sum);
    }
}

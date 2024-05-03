/*
* Recebe dois numeros A e B
* Calcula multiplos de A menores que B
* */

import java.util.Scanner;

public class MultiplesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < n2; i++) {
            System.out.println(i);
            sum += i*n1;
        }

        System.out.println(sum);

    }
}

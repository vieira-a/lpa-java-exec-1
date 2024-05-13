/*
A confederação brasileira de natação irá promover eliminatórias para o próximo mundial.
Fazer um programa que receba a idade de um nadador e determine (imprima) a sua categoria
segundo a tabela a seguir:
Categoria Idade
Infantil A 5–7 anos
Infantil B 8–10 anos
Juvenil A 11–13 anos
Juvenil B 14–17 anos
Sênior Maiores de 18 anos
* */

package lista2.lpa.exec;

import java.util.Scanner;

public class SwimmerCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter swimmer age: ");
        int swimmerAge = sc.nextInt();

        if(swimmerAge < 5) {
            System.out.println("Swimmer age should be > 5");
        } else if(swimmerAge <= 7) {
            System.out.println("Swimmer category: Infantil A" );
        } else if(swimmerAge <= 10) {
            System.out.println("Swimmer category: Infantil B" );
        } else if(swimmerAge <= 13) {
            System.out.println("Swimmer category: Juvenil A" );
        } else if(swimmerAge <= 17) {
            System.out.println("Swimmer category: Juvenil B" );
        } else {
            System.out.println("Swimmer category: Senior" );
        }

    }
}

package lista2.lpa.exec;/*
Faça um algoritmo em Java que receba a idade de uma pessoa e informe em qual das categorias se enquadra em relação à obrigatoriedade do voto:
- Sem permissão para votar (0 a 15 anos)
- Voto facultativo (16 a 17 anos, acima de 65 anos)
- Voto obrigatório (18 a 64 anos)
*/

import java.util.Scanner;

public class MandatoryVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int yourAge = sc.nextInt();

        if(yourAge <= 15) {
            System.out.println("You cannot vote yet!");
        } else if (yourAge >= 18 && yourAge <= 64  ) {
            System.out.println("Mandatory vote");
        } else {
            System.out.println("Facultative vote");
        }
    }
}

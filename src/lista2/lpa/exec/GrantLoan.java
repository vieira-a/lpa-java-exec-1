/*
A prefeitura de Contagem abriu uma linha de crédito para os funcionários estatutários. O
valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um programa
que permita entrar com o salário bruto e o valor da prestação, e informar se o empréstimo
pode ou não ser concedido.
*/

package lista2.lpa.exec;

import java.util.Scanner;

public class GrantLoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double installmentLimit = 0.3;

        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter installment: ");
        double installment = sc.nextDouble();

        if (installment > salary * installmentLimit){
            System.out.println("Loan not granted :(");
        } else {
            System.out.println("Loan granted :)");
        }
    }
}

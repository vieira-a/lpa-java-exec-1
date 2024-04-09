/*
Leia a quantidade de fitas que uma locadora de vídeo possui e o valor que ela cobra por cada aluguel, mostrando as informações pedidas a seguir:
- Sabendo que um terço das fitas são alugadas por mês, exiba o faturamento anual da locadora;

- Quando o cliente atrasa a entrega, é cobrada multa de 10% sobre o valor do aluguel.
- Sabendo que um décimo das fitas alugadas no mês são devolvidas com atraso, calcule o valor ganho com multas por mês;

- Sabendo que ainda 2% de fitas se estragam ao longo do ano, e um décimo do total é comprado para reposição, exiba a quantidade de fitas que a locadora terá no final do ano.
*/

import java.util.Scanner;

public class RentalBilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tapes;
        System.out.print("Quantidade de fitas: ");
        tapes = scanner.nextInt();

        double tapesRented = tapes * 0.33;

        double rentalValue;
        System.out.print("Valor do aluguel: ");
        rentalValue = scanner.nextDouble();

        double tapesReturnedLate = tapesRented * 0.10;
        double returnedLateTax = rentalValue * 0.10;

        double lateBilling = tapesReturnedLate * returnedLateTax;


        double billingRentedTypes = tapesRented * rentalValue;
        double monthlyBilling = billingRentedTypes + lateBilling;
        double anualBilling = monthlyBilling * 12;

        double damagedTapesByYear = tapes * 0.02;

        double tapeBalance = (tapes - damagedTapesByYear);

        double replacedTapes = tapeBalance * 0.10;

        double totalBalance = tapeBalance + replacedTapes;

        System.out.println("Faturamento Mensal: " + String.format("%.2f", monthlyBilling));
        System.out.println("Faturamento Anual: " + String.format("%.2f", anualBilling));
        System.out.println("Saldo de fitas da locadora: " + String.format("%.2f", totalBalance) );

    }
}

/*
Escreva um programa para ler o número de lados de um polígono regular e a medida do
lado (em cm). Calcular e imprimir o seguinte:
– Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor do seu perímetro.
– Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
– Se o número de lados for igual a 5 escrever PENTÁGONO.
Observação: Considere que o usuário só informará os valores 3, 4 ou 5.
*/

package lista2.lpa.exec;

import java.util.Scanner;

public class FormType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String formType;
        double trianglePerimeter;
        double squareArea;

        System.out.println("Enter amount of sides: ");
        int amountSides = sc.nextInt();

        System.out.println("Enter side measurement: ");
        double sideMeasurement = sc.nextDouble();

        if(amountSides == 3){
            formType = "TRIANGLE";
            trianglePerimeter = amountSides * sideMeasurement;
            System.out.println("Form: " + formType + " - Perimeter: " + trianglePerimeter);
        } else if(amountSides == 4){
            formType = "SQUARE";
            squareArea = amountSides * sideMeasurement * 2;
            System.out.println("Form: " + formType + " - Area: " + squareArea);
        } else if(amountSides == 5){
            formType = "PENTAGON";
            System.out.println("Form: " + formType);
        } else {
            System.out.println("Options must to be: 3, 4 or 5");
        }

    }
}

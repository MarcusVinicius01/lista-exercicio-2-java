import java.util.Scanner;

public class ListaDoisExercicioUm {
    public static void main(String[] args) {
        double n1, n2, n3, maior, menor, media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo que exibe o maior número, o menor, e a média aritimética.");

        System.out.println("\nInforme o primeiro número: ");
        n1 = scanner.nextDouble();

        System.out.println("\nInforme o segundo número: ");
        n2 = scanner.nextDouble();

        System.out.println("\nInforme o terceiro número: ");
        n3 = scanner.nextDouble();

        if ((n1 > n2) && (n1 > n3)) {
        maior = n1;
        }
        else if ((n2 > n1) && (n2 > n3)){
        maior = n2;
        }
        else maior = n3;
        

        if ((n1 < n2) && (n1 < n3)) {
        menor = n1;
        }
        else if ((n2 < n1) && (n2 < n3)){
        menor = n2;
        }
        else menor = n3;

        media = (n1 + n2 + n3) / 3;

        System.out.println("O maior número é o: " + maior);
        System.out.println("O menor número é o: " + menor);
        System.out.println("A média dos três números é de: " + media);
        scanner.close();
    }
}
import java.util.Random;
import java.util.Scanner;

public class ListaDoisExercicioSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, maior, menor, sorteio;
       
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();
        
        if (num1 > num2) {
            maior = num1;
            menor = num2;
        } else {
            maior = num2;
            menor = num1;
        }
        
        Random gerador = new Random();
        sorteio = gerador.nextInt(menor, maior);
        System.out.println("Número sorteado: " + sorteio);
        
        if (sorteio % 2 == 0) {
            System.out.println("O número sorteado é " + sorteio + " (par)");
        } else {
            System.out.println("O número sorteado é " + sorteio + " (ímpar)");
        }
        
        sc.close();
    }
}


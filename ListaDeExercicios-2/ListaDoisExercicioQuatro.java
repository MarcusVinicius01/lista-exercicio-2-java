import java.util.Scanner;

class ListaDoisExercicioQuatro {
    public static void main(String[] args) {
        int operacao;
        double raio, pi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo indicador de operação e correspondente ao raio de um círculo ou esfera.");

        System.out.println("\nInforme a operação que deseja realizar: \n[1]Calcular e imprimir o perímetro do círculo.\n[2]Calcular e imprimir a área do círculo.\n[3]Calcular e imprimir o volume da esfera.");
        operacao = scanner.nextInt();

        System.out.println("\nAgora informe o Raio da Circunferencia: ");
        raio = scanner.nextDouble();
        
        pi = 3.141592;
    
        switch (operacao){
            case 1:
            System.out.println("\nO perimetro da circunferencia é de: " + (2 * pi * raio));
            break;

            case 2:
            System.out.println("\nA area da circunferencia é de: " + (3.141592 * raio * raio));
            break;

            case 3:
            System.out.println("\nO volume da circunferencia é de: " + (4 / 3 * pi * (raio * raio * raio)));
            break;

            default:
            System.out.println("\nO número escolhido é invalido! Digite um número de 1 a 3.");
        }
        scanner.close();
    }
}

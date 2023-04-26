import java.util.Scanner;

public class ListaDoisExercicioCinco {
    public static void main(String[] args) {
        int numeroUm, numeroDois;
        String operacao;
        double resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo que le dois números reais e um símbolo de operação");

        System.out.println("\nInforme o primeiro número: ");
        numeroUm = scanner.nextInt();

        System.out.println("\nInforme o segundo número: ");
        numeroDois = scanner.nextInt();

        System.out.println("Agora digite o simbolo da operação desejada:\n[+]Soma\n[-]Subtração\n[*]Multiplicação\n[/]Divisão\n[^]Elevar.");
        operacao = scanner.next();

        switch (operacao){
            case "+":
            resultado = numeroUm + numeroDois;
            break;
            case "-":
            resultado = numeroUm - numeroDois;
            break;
            case "*":
            resultado = numeroUm * numeroDois;
            break;
            case "/":
            resultado = numeroUm / numeroDois;
            break;
            case "^":
            resultado = Math.pow(numeroUm, numeroDois);
            break;
            default:
            System.out.println("Erro! Informe um simbolo valido.");
            return;
        }
        System.out.println("\nO resultado de: " + numeroUm + operacao + numeroDois + " é igual a " + resultado);
        scanner.close();
    }
}

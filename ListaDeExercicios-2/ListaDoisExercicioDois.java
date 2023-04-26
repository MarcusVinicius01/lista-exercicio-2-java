import java.util.Scanner;

public class ListaDoisExercicioDois {
    public static void main(String[] args){
        int valorCompra, valorPago, troco, nota50, nota20, nota10, nota5, nota2, nota1;

        Scanner input = new Scanner(System.in);

        System.out.println("Algorismo para informar Troco.");

        System.out.println("\nDigite o valor da compra: ");
        valorCompra = input.nextInt();

        System.out.println("\nDigite o valor pago: ");
        valorPago = input.nextInt();

        if(valorPago < valorCompra){
        System.out.println("A quantia paga é insuficiente para realizar a compra!");
        }
        else{ 
        troco = valorPago - valorCompra;

        nota50 = troco / 50;
        troco %= 50;

        nota20 = troco / 20;
        troco %= 20;

        nota10 = troco / 10;
        troco %= 10;

        nota5 = troco / 5;
        troco %= 5;

        nota2 = troco / 2;
        troco %= 2;

        nota1 = troco;

        System.out.println("\nO valor do troco é: " + (valorPago - valorCompra));
        System.out.println("\nNotas de R$50:  " + nota50);
        System.out.println("Notas de R$20: " + nota20);
        System.out.println("Notas de R$10: " + nota10);
        System.out.println("Notas de R$5: " + nota5);
        System.out.println("Notas de R$2: " + nota2);
        System.out.println("Notas de R$1: " + nota1);
        input.close();
        }
    }
}

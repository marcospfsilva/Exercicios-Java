package Exercicios;
import java.util.Scanner;

public class Z_Exercicio14 {
    public static void main(String[]args){
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int primeiroNumero = numero1.nextInt();
        
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Digite o segundo número: ");
        int segundoNumero = numero2.nextInt();
        
        if (primeiroNumero>segundoNumero){
            System.out.println("O Primeiro número é maior.");
        }
        else if (segundoNumero>primeiroNumero){
            System.out.println("O segundo número é maior");
        }
        else{
            System.out.println("Os números são iguais");
        }
    }
}

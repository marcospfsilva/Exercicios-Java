package Exercicios;
import java.util.Scanner;

public class Z_Exercicio14 {
    public static void main(String[]args){
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Digite um n�mero inteiro: ");
        int primeiroNumero = numero1.nextInt();
        
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Digite o segundo n�mero: ");
        int segundoNumero = numero2.nextInt();
        
        if (primeiroNumero>segundoNumero){
            System.out.println("O Primeiro n�mero � maior.");
        }
        else if (segundoNumero>primeiroNumero){
            System.out.println("O segundo n�mero � maior");
        }
        else{
            System.out.println("Os n�meros s�o iguais");
        }
    }
}

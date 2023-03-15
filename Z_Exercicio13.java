package Exercicios;
import java.util.Scanner;


public class Z_Exercicio13 {
    public static void main(String[]args){
        Scanner numero = new Scanner(System.in);
        System.out.println("Escreva um número: ");
        float numeroPedido = numero.nextFloat();
        
        if (numeroPedido >10){
            System.out.println("O número é maior que 10.");
        }
        else{
            System.out.println("O número é menor que 10.");
        }
    }
    
}

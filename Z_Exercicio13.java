package Exercicios;
import java.util.Scanner;


public class Z_Exercicio13 {
    public static void main(String[]args){
        Scanner numero = new Scanner(System.in);
        System.out.println("Escreva um n�mero: ");
        float numeroPedido = numero.nextFloat();
        
        if (numeroPedido >10){
            System.out.println("O n�mero � maior que 10.");
        }
        else{
            System.out.println("O n�mero � menor que 10.");
        }
    }
    
}

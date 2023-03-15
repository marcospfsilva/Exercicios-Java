package Exercicios;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[]args){
        Scanner valor1 = new Scanner(System.in);
        System.out.println("Escreva o primeiro número: ");
        float primeiroValor = valor1.nextFloat();
        
        Scanner valor2 = new Scanner(System.in);
        System.out.println("Escreva o segundo número : ");
        float segundoValor = valor2.nextFloat();
        
        float invertida1 = segundoValor;
        float invertida2 = primeiroValor;
        
        primeiroValor = invertida1;
        segundoValor = invertida2;
        
        
        System.out.println("Primeiro Valor: "+  primeiroValor);
        System.out.println("Segundo Valor: "+ segundoValor);
        
    }
}

package Exercicios;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String []args){
        Scanner valor = new Scanner(System.in);
        System.out.println("Quanto você tem em dolar: ");
        float valorDolar = valor.nextFloat();
        
        Scanner cotacao = new Scanner(System.in);
        System.out.println("Qual o valor da cotação?: ");
        float cotacaoReal = cotacao.nextFloat();
        
        double conversao = valorDolar * cotacaoReal;
        
        System.out.println("Seu valor em reais: " + conversao);
    }
}

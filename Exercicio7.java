package Exercicios;
import java.util.Scanner;


public class Exercicio7 {
    public static void main(String [] args){
        Scanner celsius = new Scanner(System.in);
        System.out.println("Qual o valor em graus celsius: ");
        float grausCelsius = celsius.nextFloat();
        
        float calculoFahrenheit = (9*grausCelsius+160)/5;
        
        System.out.println("Valor em Fahrenheit: "+calculoFahrenheit+"ºF");
    }
}

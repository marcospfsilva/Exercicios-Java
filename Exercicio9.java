package Exercicios;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String []args){
        double juroPoupanca = 0.07;
        
        Scanner valor = new Scanner(System.in);
        System.out.println("Quanto você vai guardar na poupança?: ");
        double valorInicial = valor.nextFloat();
        
        Scanner meses = new Scanner(System.in);
        System.out.println("Quantos meses você vai guardar?: ");
        int qtdMeses = meses.nextInt();
        
        
        int contador = 0;
        while (contador < qtdMeses){
            valorInicial = valorInicial + (valorInicial*juroPoupanca/100);
            
            contador = contador +1;
            
            System.out.println("Valor após "+ contador + " mês: " + valorInicial);            
            
        }   
           
    }
}

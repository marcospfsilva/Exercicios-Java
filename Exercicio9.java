package Exercicios;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String []args){
        double juroPoupanca = 0.07;
        
        Scanner valor = new Scanner(System.in);
        System.out.println("Quanto voc� vai guardar na poupan�a?: ");
        double valorInicial = valor.nextFloat();
        
        Scanner meses = new Scanner(System.in);
        System.out.println("Quantos meses voc� vai guardar?: ");
        int qtdMeses = meses.nextInt();
        
        
        int contador = 0;
        while (contador < qtdMeses){
            valorInicial = valorInicial + (valorInicial*juroPoupanca/100);
            
            contador = contador +1;
            
            System.out.println("Valor ap�s "+ contador + " m�s: " + valorInicial);            
            
        }   
           
    }
}

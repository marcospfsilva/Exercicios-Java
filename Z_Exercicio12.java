package Exercicios;
import java.util.Scanner;

public class Z_Exercicio12 {
    public static void main(String[]args){
        Scanner custo = new Scanner(System.in);
        System.out.println("Qual o custo de fábrica do carro?: ");
        float custoFabrica = custo.nextFloat();
        
        float adicaoImpostos = custoFabrica + (custoFabrica*45/100);
        
        float valorTotal = adicaoImpostos + (adicaoImpostos*28/100);
        
        System.out.println("O valor total do carro será: R$"+valorTotal);
    }
}

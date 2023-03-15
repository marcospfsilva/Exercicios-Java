package Exercicios;

import java.util.Scanner;


public class Exercicio3 {
    
    public static void main(String [] args){
        Scanner kms = new Scanner(System.in);
        Scanner combustivel = new Scanner(System.in);
        
        System.out.println("Informe quantos km percorreu: ");
        float kmsPercorridos = kms.nextFloat();
        
        System.out.println("Informe quanto de combustível gastou: ");
        float combustivelGasto = combustivel.nextFloat();
        
        float consumoMedio = combustivelGasto / kmsPercorridos ;
        
        System.out.println("O consumo médio foi de: " + consumoMedio + " litros por km");
    }
    
}

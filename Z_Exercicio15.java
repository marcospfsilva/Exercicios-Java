package Exercicios;
import java.util.Scanner;

public class Z_Exercicio15 {
    public static void main(String[]args){
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um número: ");
        float numeroRecebido = numero.nextFloat();
        
        if (numeroRecebido >=100 && numeroRecebido <=200){
            System.out.println("O seu número está entre 100 e 200");
        }
        else{
            System.out.println("O número não está entre 100 e 200");
        }
    }
}

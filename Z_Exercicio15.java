package Exercicios;
import java.util.Scanner;

public class Z_Exercicio15 {
    public static void main(String[]args){
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um n�mero: ");
        float numeroRecebido = numero.nextFloat();
        
        if (numeroRecebido >=100 && numeroRecebido <=200){
            System.out.println("O seu n�mero est� entre 100 e 200");
        }
        else{
            System.out.println("O n�mero n�o est� entre 100 e 200");
        }
    }
}

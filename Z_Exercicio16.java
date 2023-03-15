package Exercicios;
import java.util.Scanner;

public class Z_Exercicio16 {
    public static void main(String[]args){
        Scanner nota1 = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float primeiraNota = nota1.nextFloat();
        
        Scanner nota2 = new Scanner(System.in);
        System.out.println("Digite a segunda nota: ");
        float segundaNota = nota2.nextFloat();
        
        Scanner nota3 = new Scanner(System.in);
        System.out.println("Digite a terceira nota: ");
        float terceiraNota = nota3.nextFloat();
        
        float media = (primeiraNota + segundaNota + terceiraNota)/3;
        
        if (media >=7){
            System.out.println("Aprovado");
        }
        else if(media<=5){
            System.out.println("Reprovado");
        }
        else{
            System.out.println("Recuperação");
        }
    }
}

package Exercicios;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio5 {
    
    public static void main(String[]args){
        Scanner nome = new Scanner(System.in);
        System.out.println("Qual o nome do aluno?: ");
        String nomeAluno = nome.nextLine();
        
        int contador = 0;
        float [] notaAluno;
        notaAluno = new float[3];
        while (contador <3){
            Scanner nota = new Scanner(System.in);
            System.out.println("Coloque a nota: ");
            notaAluno[contador] = nota.nextFloat();
            
            contador = contador + 1;
        
        }
        float soma = 0; 
        for (float n : notaAluno){ //Pegando os valores dentro da lista e somando
            soma += n;
        }
        float media = soma/3;
        
        
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Notas: " + Arrays.toString(notaAluno)); //imprime o array notaAluno
        System.out.println("Soma das Notas: " + soma);
        System.out.println("Media das Notas: " + media);
        
        if (media >=6){
            if (media == 10){
                System.out.println("Parabéns ao aluno. Ele foi 10!!!");
            }
            else {
                System.out.println("Aluno Aprovado!");
            }
        }
        else{
            System.out.println("Aluno Reprovado");
        }
        
        
        
    }
}

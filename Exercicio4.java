package Exercicios;
import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args){
        
        Scanner nome = new Scanner(System.in);
        Scanner salario = new Scanner(System.in);
        Scanner vendasMes = new Scanner(System.in);
        
        System.out.println("Qual seu nome?: ");
        String nomeVendedor = nome.nextLine();
        
        System.out.println("Qual o seu sal�rio fixo?: ");
        float salarioFixo = salario.nextFloat();
        
        System.out.println("Quanto voc� vendeu no m�s?: ");
        float total_vendasMes = vendasMes.nextFloat();
        
        float comissao = (total_vendasMes*15)/100;
        float salarioTotal = salarioFixo + comissao;
        
        System.out.println("Nome: " + nomeVendedor);
        System.out.println("Seu sal�rio fixo: " + salarioFixo);
        System.out.println("Sua comiss�o: " + comissao);
        System.out.println("Seu sal�rio total: " + salarioTotal);
        
        
    }
    
}

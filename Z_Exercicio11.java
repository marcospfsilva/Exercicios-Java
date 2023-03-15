package Exercicios;
import java.util.Scanner;

public class Z_Exercicio11 {
    public static void main(String[]args){
        Scanner custo = new Scanner(System.in);
        System.out.println("Qual foi o custo do produto?: ");
        float custoProduto = custo.nextFloat();
        
        Scanner porcentagem = new Scanner(System.in);
        System.out.println("Quantos por cento de adição no valor?: ");
        float porcentagemVenda = porcentagem.nextFloat();
        
        float valorVenda = custoProduto + (custoProduto*porcentagemVenda/100);
        
        System.out.println("O valor de venda do produto vai ser: R$"+valorVenda);
    }
}

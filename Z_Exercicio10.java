package Exercicios;
import java.util.Scanner;


public class Z_Exercicio10 {
    
    public static void main(String[]args){
        Scanner valor = new Scanner(System.in);
        System.out.println("Valor da compra: ");
        float valorCompra = valor.nextFloat();
        
        Scanner parcelas = new Scanner(System.in);
        System.out.println("Quantas parcelas?: ");
        int qtdParcelas = parcelas.nextInt();
        
        if (qtdParcelas>0 && qtdParcelas <6){         
            float valorParcelado = valorCompra/qtdParcelas;
            System.out.println("Vão ser " + qtdParcelas + " parcelas de " + valorParcelado);
        }
        else{
            System.out.println("Essa quantidade de parcelas não é permitida");
        }
        
    }
}

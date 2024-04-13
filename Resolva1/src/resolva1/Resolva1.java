/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolva1;
import java.util.Scanner;

/**
 *
 * @author Aluno CA
 */
public class Resolva1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float num1;
        float num2;
        float soma;
        float sub;
        float mult;
        float div;    
        
        num1 = 5;
        num2 = 2;
        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        
        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + sub);
        System.out.println("A multiplicaçõa é: " + mult);
        System.out.println("A divisão é: " + div);
        
        int combustivel;
        int distancia;
        int media;
        
        combustivel = 50;
        distancia = 100;
        media = (distancia / combustivel);
        
        System.out.println("A media de combustivel gasto por litro é: " + media);
        
        Scanner sc = new Scanner(System.in);
        
        float salario, vendas, com, total;
        String nome;
        
          System.out.println("Digite seu nome: "); 
          nome = sc.next();
          
          System.out.println("Digite seu salário fixo R$: "); 
          salario = sc.nextInt();
          
          System.out.println("Digite o total de vendas efetuadas: "); 
          vendas = sc.nextInt();
          
          com = (float) (vendas/100) * 15;
  
          total = com + salario;
          
          System.out.println(
                "Seu nome é: " + nome + "\n" +
                "Seu salário fixo é = " + salario + "\n" +
                "Salário ao final do mês = " + total); 
        
        
    }
    
}

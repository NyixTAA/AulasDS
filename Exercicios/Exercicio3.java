/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.pkg1.pkg4;

/**
 *
 * @author Aluno CA
 */
public class Exercicio3 {
    
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 5;
        
        int codigo = 2;
        
        int media = (num1 + num2)/2; 
        int sub = (num1 - num2); 
        int mult = (num1 * num2); 
        int div = (num1/num2); 
        
        
           switch(codigo){
           case 1 -> System.out.println("A média é = " + media);
           case 2 -> System.out.println("A diferença é = " + sub);
           case 3 -> System.out.println("O produto é = " + mult);
           case 4 -> System.out.println("A divisão é = " + div);
           
     
           
        }
    }
}

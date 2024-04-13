/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.pkg1.pkg4;

/**
 *
 * @author Aluno CA
 */
public class Exercicio2 {
 
    public static void main(String[] args) {
    
        double nota1 = 9.1;
        double nota2 = 9.91;
        double media;
        int mediafinal = 0;
        media = (nota1 + nota2)/2;
        
        if (media >= 0 && media <= 4){
            mediafinal = 1;
        }else if(media > 4 && media <= 7){
            mediafinal = 2;
        }else{
            mediafinal = 3;
        }
        
        switch (mediafinal){
            
            case 1 -> System.out.println("Reprovado");
            case 2 -> System.out.println("Exame");
            case 3 -> System.out.println("Aprovado");
            
        }
        
    }
    
}

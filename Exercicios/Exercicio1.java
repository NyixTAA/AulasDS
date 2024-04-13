/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios.pkg1.pkg4;

/**
 *
 * @author Aluno CA
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numerotabela = 3;
        
        if (numerotabela == 2 || numerotabela == 3 || numerotabela == 4){
            numerotabela = 2;
        }else if(numerotabela == 5 || numerotabela == 6){
            numerotabela = 5;
        }else if(numerotabela >= 8 && numerotabela <= 15){
            numerotabela = 8;
        }
        switch (numerotabela){
        
            case 1 -> System.out.println("Alimento não-perecível");
            case 2 -> System.out.println("Alimento perecível");
            case 5 -> System.out.println("Vestuário");
            case 7 -> System.out.println("Higiene pessoal");
            case 8 -> System.out.println("Limpeza e utensílios domésticos");
            default -> System.out.println("Código Inválido");
        
    }
    
}

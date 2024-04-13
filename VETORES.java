/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;
import java.util.Scanner;

/**
 *
 * @author Aluno CA
 */
public class VETORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero [] = new int[5];
        Scanner entrada = new Scanner (System.in);
        
        for (int indice=0; indice<5;indice++)
        {
         System.out.println("Digite um Numero: ");
         numero[indice] = entrada.nextInt();
        }
    }
    
}

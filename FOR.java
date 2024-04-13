/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;
import java.util.Scanner;

/**
 *
 * @author Aluno CA
 */
public class EX1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tabuada = new Scanner (System.in);
        System.out.println("Digite o numero da tabuada desejada: ");
        int num = tabuada.nextInt();
        for (int cont = 0; cont <= 10; cont++)
        {
            int result;
            result = num * cont;
            System.out.println(num + "x" + cont + "=" + result);
        }
    }
    
}

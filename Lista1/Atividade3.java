/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1;
import java.util.Scanner;
/**
 *
 * @author Gabri
 */
public class Atividade3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Digite dois valores: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        System.out.println("Soma = " + (num1+num2));
        System.out.println("Subtração = " + (num1 - num2));
        System.out.println("Multiplicação = " + (num1 * num2));
        System.out.println("Divisão = " + num1 / num2);
    }
    
}

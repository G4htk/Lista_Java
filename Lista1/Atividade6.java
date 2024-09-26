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
public class Atividade6 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num;
    
        System.out.println("Digitr um número: ");
        num = scan.nextInt();
        
        System.out.println(num + " elevado a 2 é: " + Math.pow(num, 2));
        System.out.println(num + " elevado a 4 é: " + Math.pow(num, 4));
        System.out.println(num + " elevado a 6 é: " + Math.pow(num, 6));
        System.out.println(num + " elevado a 8 é: " + Math.pow(num, 8));
        System.out.println(num + " elevado a 10 é: " + Math.pow(num, 10));
        
    }
}

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
public class Atividade7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Digite dois número: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        System.out.print(num1 + " é maior que " + num2 + "? "); System.out.println(num1 > num2);
        System.out.print(num1 + " é menor que " + num2 + "? "); System.out.println(num1 < num2);
        System.out.print(num1 + " é igual a " + num2 + "? "); System.out.println(num1 == num2);
        System.out.print(num1 + " é diferente de " + num2 + "? "); System.out.println(num1 != num2);
    }
    
}

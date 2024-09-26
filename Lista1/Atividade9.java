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
public class Atividade9 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num;
    
        System.out.println("Digite um número: ");
        num = scan.nextInt();
        
        if(num > 10 && num < 100){
            System.out.printf(num + " elevado a 2 = a %.5f", Math.pow(num, 2));
        }
        else{
            System.out.printf("Raiz quadrada do " + num + " é %.5f ", Math.sqrt(num));
        }
        
            }
}

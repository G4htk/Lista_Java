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
public class Atividade5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        
        System.out.println("Digite um número: ");
        num = scan.nextInt();
        
        if(num % 2 == 1){
            System.out.println(num + " é ímpar");
        }
        else{System.out.println(num + " é par");
        }
    }
    
}

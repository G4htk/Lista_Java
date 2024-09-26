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
public class Atividade4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Digite dois números: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        if(num1 > num2){
            System.out.println(num1 + " é maior");
        }
        else if (num1 < num2){
            System.out.println(num2 +  " é maior");
        }
        else{System.out.println("Iguais");
        }
        }
    }
    
}

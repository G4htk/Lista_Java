/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2;
import java.util.Scanner;
/**
 *
 * @author Gabri
 */
public class Atividade6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1, num2, res;
        char sim;
        
        System.out.println("Digite dois números e um operador aritmético: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        sim = scan.next().charAt(0);
        
        switch(sim){
            case '+':
                res = num1 + num2;
                System.out.println("Resultado é: "+ res);
                break;
            case '-':
                res = num1 - num2;
                System.out.println("Resultado é: "+ res);
                break;
            case '*':
                res = num1 * num2;
                System.out.println("Resultado é: "+ res);
                break;
            case'/': 
                res = num1 / num2;
                System.out.println("Resultado é: "+ res);
                break;
            default:
                System.out.println("Operador inválido");
        }
        }
    }
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
public class Atividade8 { 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double val1, val2, res;
        
        System.out.println("Informe valor do relógio de água do dia 1º: ");
        val1 = scan.nextDouble();
        
        System.out.println("Informe valor do relógio de água do dia 30º:");
        val2 = scan.nextDouble();
        
        res = val1 + val2;
        
        System.out.println("Litros consumidos no total: " + res);
        
        System.out.println("\n");
        
        System.out.println("Média por dia: " + (res / 30));
        
    }
    
}

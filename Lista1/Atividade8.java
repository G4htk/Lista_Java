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
        
        System.out.println("Informe valor do rel�gio de �gua do dia 1�: ");
        val1 = scan.nextDouble();
        
        System.out.println("Informe valor do rel�gio de �gua do dia 30�:");
        val2 = scan.nextDouble();
        
        res = val1 + val2;
        
        System.out.println("Litros consumidos no total: " + res);
        
        System.out.println("\n");
        
        System.out.println("M�dia por dia: " + (res / 30));
        
    }
    
}

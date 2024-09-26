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
public class Atividade7 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int mes;
        
        System.out.println("Digite um mês (número): ");
        mes = scan.nextInt();
        
        if(mes < 1 || mes > 12){
                    System.out.println("Mês inválido");
                    }
        else if(mes > 9){
            System.out.println("Mês ainda não chegou");
            }
        else if(mes < 9){
            System.out.println("Mês já passou");
        }
            
            else{ System.out.println("Mês atual");
                    }
        }
        
    }
    

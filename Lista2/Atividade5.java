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
public class Atividade5 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int ano, idade;
        
        System.out.println("Ano de nascimento: ");
        ano = scan.nextInt();
        
        idade = 2024 - ano;
        
        if (idade >= 18){
            System.out.println("Maior de idade, pode dirigir e votar :)");
        }
        
        else if(idade >= 16 && idade < 18){
            System.out.println("Ja pode votar :|");
        }
        
        else { System.out.println("Menor de idade :(");
        }
        }
    }
 

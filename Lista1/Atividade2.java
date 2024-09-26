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
public class Atividade2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int idade;
        String nome, cor, esporte, genero;
        
        System.out.println("Informe seu nome, idade, gênero, cor favorita e se pratica esporte:");
        nome = scan.next();
        idade = scan.nextInt();
        genero = scan.next();
        cor = scan.next();
        esporte = scan.next();
        
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu gênero é: " + genero);
        System.out.println("Sua cor favorita é: " + cor);
        System.out.println("Pratica esporte?: " + esporte);
        
    }
    
}

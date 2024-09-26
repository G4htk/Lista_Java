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
public class Atividade9 {

    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      double valor, codigo, parcela, desconto, resultado;
      
        System.out.println("Insira o valor total: ");
        valor = scan.nextDouble();
        
        System.out.println("Insira o código de pagamento: ");
        codigo = scan.nextDouble();
        
        if (codigo == 1) {
            desconto = (valor*10)/100;
            resultado = valor - desconto;
            System.out.println("Valor a ser pago: "+ resultado);
            System.out.println("Número de parcelas: 0");
            System.out.println("Valor por parcela: A vista ");
        }
        else if (codigo == 2) {
            desconto = (valor*8)/100;
            resultado = valor - desconto;
            System.out.println("Valor a ser pago: "+ resultado);
            System.out.println("Número de parcelas: 1");
            System.out.println("Valor por parcela: " + resultado);
        }
        else if (codigo == 3) {
            desconto = (valor*8)/100;
            resultado = valor - desconto;
            parcela = resultado / 5; 
            System.out.println("Valor a ser pago: "+ valor);
            System.out.println("Número de parcelas: 5");
            System.out.println("Valor por parcela: "+ parcela);
        }
        else if (codigo == 4) {
            desconto = (valor*10)/100;
            resultado = valor + desconto;
            parcela = resultado / 10;
            System.out.println("Valor a ser pago: "+ resultado);
            System.out.println("Número de parcelas: 10");
            System.out.println("Valor por parcela: " + parcela);
        }
        else{System.out.println("Código inválido");}
    }
}
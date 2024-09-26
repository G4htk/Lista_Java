/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int matricula;
        double horas, valor, salario, cento, resultado;
        String mes = "";
    
        System.out.println("Digite as seguintes informações: ");
        System.out.println("Número da mátricula: ");
        matricula = scan.nextInt();
        System.out.println("\n");
        
        System.out.println("Número de horas trabalhadas: ");
        horas = scan.nextDouble();
        System.out.println("\n");
        
        System.out.println("Valor por hora: ");
        valor = scan.nextDouble();
        System.out.println("\n");
        
        System.out.println("Mês: ");
        mes = scan.next();
        System.out.println("\n");
        
        salario = horas * valor;
        
        System.out.println("Matricula é: "+ matricula);
        System.out.println("Horas: "+ horas);
        System.out.println("valor: "+ valor);
        System.out.println("Mês: "+ mes);
        
        if(horas > 200){
            cento = salario / 2;
            resultado = salario + cento;
            System.out.println("Com o adicional, o salário seria: "+ resultado);
        }
        else{
            System.out.println("Salário: "+ salario);
        }
        
        
    }
}

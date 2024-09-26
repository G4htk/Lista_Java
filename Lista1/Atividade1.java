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
public class Atividade1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double nota1, nota2, resultado;
        
        System.out.println("Digite suas notas: ");
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        
        resultado = (nota1 + nota2) / 2;
        
        if(resultado >= 60){
            System.out.println("Aprovado");
        }
            else if(resultado > 40 && resultado < 60){
                    System.out.println("Substitutiva");
                    }
            else{System.out.println("Reprovado");
            }
    }
                    }
        }
        
    }
    
}

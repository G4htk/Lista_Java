
package ParaPraticar;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args){
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite dois números");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        if(num1 < num2){
            while(num1 < num2){
                num1++;
                System.out.println("Contador: "+ num1);
            }
        }
            
            else if (num1 > num2){
            while(num1 > num2){
                num1--;
                System.out.println("Contador: " + num1);
            }
            }
            else{
                    System.out.println("Número iguais.");
                    }
                    }
        }
    
                    

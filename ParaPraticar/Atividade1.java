
package ParaPraticar;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int num1, num2;

       System.out.println("Digite um número: ");
       num1 = scan.nextInt();
       
       System.out.println("Digite número: ");
       num2 = scan.nextInt();
       
       for (int i=num1+1; i<num2; i++){
           System.out.println(i);
       }
    }
}
  

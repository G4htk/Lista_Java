package Lista2;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("Digite três valores");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        
        if(num1 > num2 && num2 > num3){
            System.out.println("Maior: " + num1);
            System.out.println("Mediano: "+ num2);
            System.out.println("Menor: "+num3);
        }
               else if(num1 > num2 && num3 > num2){
            System.out.println("Maior: " + num1);
            System.out.println("Mediano: "+ num3);
            System.out.println("Menor: "+num2);
        }
        else if(num2 > num1 && num1 > num3){
            System.out.println("Maior: " + num2);
            System.out.println("Mediano: "+ num1);
            System.out.println("Menor: "+num3);
        }
        else if(num1 < num2 && num1 < num3 && num2 > num3){
            System.out.println("Maior: " + num2);
            System.out.println("Mediano: "+ num3);
            System.out.println("Menor: "+num1);
        }
        else if(num3 > num2 && num2 < num1){
            System.out.println("Maior: " + num3);
            System.out.println("Mediano: "+ num1);
            System.out.println("Menor: "+num2);
        }
        else if(num3 > num2 && num2 > num1){
            System.out.println("Maior: " + num3);
            System.out.println("Mediano: "+ num2);
            System.out.println("Menor: "+num1);
        }
        }
}

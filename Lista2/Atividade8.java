
package Lista2;
import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int idade;
        
        System.out.println("Informe sua idade: ");
        idade = scan.nextInt();
        
        if(idade <= 7 && idade>=5){
            System.out.println("Infantil A");
        }
        else if(idade <= 10 && idade >= 8){
            System.out.println("Infantil B");
        }
        else if(idade <= 13 && idade >= 11){
            System.out.println("Juvenil A");
        }
        else if(idade <= 17 && idade >= 14){
        System.out.println("Juvenil B");
        }
        else if(idade >= 18){
            System.out.println("Adulto");
        }
        else{System.out.println("Idade inválida");
        }
        
    }
    
}

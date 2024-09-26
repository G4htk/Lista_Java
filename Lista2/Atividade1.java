package Lista2;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double r;
    
        System.out.println("Insira o raio da esfera");
        r = scan.nextDouble();
        
        double V;
        
        V = (4*3.14)* (Math.pow(r, 3)/3);
        
        System.out.println("Volume = "+ V);
        
        
        
        
        
    
    }
    
    
}

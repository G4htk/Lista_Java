
package Lista2;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] arg){
    Scanner scan = new Scanner(System.in);
    double altura, peso, idealH, idealM;
    String sexo;
    
        System.out.println("Informe sua altura, peso e sexo: ");
        altura = scan.nextDouble();
        peso = scan.nextDouble();
        sexo = scan.next();
        idealH = (72.7 * altura) - 58;
        idealM = (62.1 * altura) - 44.7;
        
        if("masculino".equals(sexo)){
            if(peso > idealH){
                System.out.println("Acima do peso");
            }
            else if(peso < idealH){
                System.out.println("Abaixo do peso");
            }
                else{System.out.println("Peso ideal");
            }
            }
        else if ("feminino".equals(sexo)){
            if(peso > idealM){
                System.out.println("Peso acima");
            }
            else if(peso < idealM){
                System.out.println("Peso abaixo");
            }
            else{System.out.println("Peso ideal");
        }
    }
    }   
}

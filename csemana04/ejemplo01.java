
package csemana04;
import java.util.Scanner;
public class ejemplo01 {
    public static void main(String[] args) {
        float num;
        num = leerNumero();
        valorAbsoluto(num);
    }
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.println("Ingrese un numero: ");
        num= Float.parseFloat(teclado.next());
        return num;
        
                
    }
    static void valorAbsoluto(float num){
        if (num < 0) {
            num= num*-1;
            
        }
        System.out.println("el valor absoluto es: "+ num);
    }
}

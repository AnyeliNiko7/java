/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csemana04;
import java.util.Scanner;
/**
 *
 * @author PC13-LAB01
 */
public class tarea02 {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = leerNumero();
        num2 = leerNumero();
        num3 = leerNumero();
        determinarMayorMenorIntermedio(num1, num2, num3);
    }
    
    static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num = Integer.parseInt(teclado.next());
        return num;   
    }
    
    static void determinarMayorMenorIntermedio(int num1, int num2, int num3) {
        int mayor, menor, intermedio;
        
        mayor = num1;
        menor = num1;
        intermedio = num1;
        
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num2 < menor) {
            menor = num2;
        }
        if (num2 != mayor && num2 != menor) {
            intermedio = num2;
        }
        
        if (num3 > mayor) {
            mayor = num3;
        }
        if (num3 < menor) {
            menor = num3;
        }
        if (num3 != mayor && num3 != menor) {
            intermedio = num3;
        }
        
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
        System.out.println("El intermedio es: " + intermedio);
    }
}

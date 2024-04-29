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
public class tarea03 {
    public static void main(String[] args) {
        float soles;
        soles = leerSoles();
        convertirMoneda(soles);
    }
        static float leerSoles() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de soles a convertir: ");
        float soles = Float.parseFloat(teclado.next());
        return soles;
    }
       static void convertirMoneda(float soles) {
       float dolares = 0, euros = 0, marcos = 0, yenes = 0;;
        if (soles > 0) {
            dolares = soles / 3.30f;
            euros = soles / 3.57f;
            marcos = soles / 1.83f;
            yenes = soles / 0.03f;
            
            System.out.println("Cantidad de Soles: " + soles);
            
            if (dolares > 0) {
                System.out.println("Equivalente en Dólares: " + dolares);
            }
            if (euros > 0) {
                System.out.println("Equivalente en Euros: " + euros);
            }
            if (marcos > 0) {
                System.out.println("Equivalente en Marcos: " + marcos);
            }
            if (yenes > 0) {
                System.out.println("Equivalente en Yenes: " + yenes);
            }
        } 
        if (soles <= 0) {
            System.out.println("La cantidad de soles ingresada no es válida.");
        }
    }
}

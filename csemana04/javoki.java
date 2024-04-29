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
public class javoki {
    static float num1, num2;
    public static void main(String[] args) {
        float su;
        num1 =leerNumero();
        num2 =leerNumero();
        su = suma();
        System.out.println("la suma es: " + su);
    }
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.print("Ingrese un numero: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static float suma(){
        float suma;
        suma = num1 + num2;
        return suma;
    }
}

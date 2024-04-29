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
public class javaki {
    static Scanner teclado = new Scanner(System.in);
    static float num1, num2;
    public static void main(String[] args) {
        num1 = leerNumero();
        num2 = leerNumero();
        suma();
    }
    static float leerNumero(){
        float num;
        System.out.println("Ingrese un NUmero: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static void suma(){
        float suma;
        suma= num1 + num2;
        System.out.println("la suma es: "+ suma);
    }
}

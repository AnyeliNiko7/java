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
public class javaco {
    public static void main(String[] args) {
        float num1,num2;
        num1 =leerNumero();
        num2 =leerNumero();
        suma(num1,num2);
    }
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.println("Inserte un numero: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static void suma(float num1, float num2){
        float suma;
        suma = num1 + num2;
        System.out.println("la suma es:"+ suma);
    }
}

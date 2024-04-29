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
public class ejemplo02 {
    public static void main(String[] args) {
        float num1,num2,num3, mayor;
        num1 = leerNumero();
        num2 = leerNumero();
        num3 = leerNumero();
        mayor =hallarMayor(num1, num2, num3);
        imprimir(mayor);
    }
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num1;
        System.out.println("Ingrese un numero: ");
        num1= Float.parseFloat(teclado.next());
        return num1;
    }
    static float hallarMayor(float num1,float num2, float num3){
    float mayor;
    if(num1 > num2 && num1 > num3){
       mayor = num1;
    }else{
        if(num2 > num1 && num2 > num3){
        mayor = num2;
     }else{
        mayor = num3;
    }
    }
    return mayor;
}
    static void imprimir(float mayor){
        System.out.println("el mayor es"+ mayor);
    }

}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csemana04;
import java.util.Scanner;
/**
 *
 * @author angyn
 */
public class semana02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de dinero a repartir:");
        float cantidadTotal = teclado.nextFloat();
        
        float montoJosue = cantidadTotal * 0.27f;
        float montoDaniel = cantidadTotal * 0.25f;
        float montoJose = cantidadTotal * 0.23f;
        float montoJacinto = montoJosue * 0.85f;
        float montoAntonio = (montoJose + montoDaniel) * 0.23f;
        float montoDavid = cantidadTotal - (montoJosue + montoDaniel + montoJose + montoJacinto + montoAntonio);
        
        System.out.println("Monto para Jacinto: " + montoJacinto);
        System.out.println("Monto para José: " + montoJose);
        System.out.println("Monto para Antonio: " + montoAntonio);
        System.out.println("Monto para Daniel: " + montoDaniel);
        System.out.println("Monto para David: " + montoDavid);
        
        teclado.close();
    }
}


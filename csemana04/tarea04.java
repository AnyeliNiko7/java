package csemana04;
import java.util.Scanner;
/**
 *
 * @author PC13-LAB01
 */
public class tarea04 {
    public static void main(String[] args) {
        int claseAuto;
        float tarifaBase, costoPorKm, kmRecorridos, costoTotal;
        
        claseAuto = leerClaseAuto();
        tarifaBase = obtenerTarifaBase(claseAuto);
        costoPorKm = obtenerCostoPorKm(claseAuto);
        kmRecorridos = leerKmRecorridos();
        costoTotal = calcularCostoTotal(tarifaBase, costoPorKm, kmRecorridos);
        
        imprimirCostoTotal(costoTotal);
    }
    
    static int leerClaseAuto() {
        Scanner teclado = new Scanner(System.in);
        int claseAuto;
        
        System.out.println("Ingrese la clase de auto (1: pequeño, 2: mediano, 3: grande): ");
        claseAuto = Integer.parseInt(teclado.next());
        
        return claseAuto;
    }
    
    static float obtenerTarifaBase(int claseAuto) {
        float tarifaBase;
        
        if (claseAuto == 1) {
            tarifaBase = 15.00f;
        } else if (claseAuto == 2) {
            tarifaBase = 20.00f;
        } else {
            tarifaBase = 30.00f;
        }
        
        return tarifaBase;
    }
    
    static float obtenerCostoPorKm(int claseAuto) {
        float costoPorKm;
        
        if (claseAuto == 1) {
            costoPorKm = 0.20f;
        } else if (claseAuto == 2) {
            costoPorKm = 0.30f;
        } else {
            costoPorKm = 0.40f;
        }
        
        return costoPorKm;
    }
    
    static float leerKmRecorridos() {
        Scanner teclado = new Scanner(System.in);
        float kmRecorridos;
        
        System.out.println("Ingrese la cantidad de kilómetros recorridos por día: ");
        kmRecorridos = Float.parseFloat(teclado.next());
        
        return kmRecorridos;
    }
    
    static float calcularCostoTotal(float tarifaBase, float costoPorKm, float kmRecorridos) {
        float costoTotal;
        
        costoTotal = tarifaBase + (costoPorKm * kmRecorridos);
        
        if (kmRecorridos > 10) {
            costoTotal *= 1.025f; // Aumento del 2.5%
        }
        
        return costoTotal;
    }
    
    static void imprimirCostoTotal(float costoTotal) {
        System.out.println("El costo total es: S/. " + costoTotal);
    }
}

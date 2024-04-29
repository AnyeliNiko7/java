package csemana04;
import java.util.Scanner;
/**
 *
 * @author PC13-LAB01
 */
public class practicacalificada01 {
    /**
     * 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio de la camisa: ");
        double precioCamisa = scanner.nextDouble();
        
        System.out.print("Ingrese la cantidad de camisas adquiridas: ");
        int cantidadCamisas = scanner.nextInt();
        
        double importeCompra = calcularImporteCompra(precioCamisa, cantidadCamisas);
        double primerDescuento = calcularPrimerDescuento(importeCompra);
        double segundoDescuento = calcularSegundoDescuento(importeCompra, primerDescuento);
        double descuentoTotal = calcularDescuentoTotal(primerDescuento, segundoDescuento);
        double importeAPagar = calcularImporteAPagar(importeCompra, descuentoTotal);
        
        System.out.println("Importe de la compra: $" + importeCompra);
        System.out.println("Importe del primer descuento: $" + primerDescuento);
        System.out.println("Importe del segundo descuento: $" + segundoDescuento);
        System.out.println("Importe del descuento total: $" + descuentoTotal);
        System.out.println("Importe a pagar: $" + importeAPagar);
        
        scanner.close();
    }
    
    public static double calcularImporteCompra(double precio, int cantidad) {
        return precio * cantidad;
    }
    
    public static double calcularPrimerDescuento(double importeCompra) {
        return 0.07 * importeCompra;
    }
    
    public static double calcularSegundoDescuento(double importeCompra, double primerDescuento) {
        return importeCompra = 0.07 *primerDescuento;
    }
    
    public static double calcularDescuentoTotal(double primerDescuento, double segundoDescuento) {
        return primerDescuento + segundoDescuento;
    }
    
    public static double calcularImporteAPagar(double importeCompra, double descuentoTotal) {
        return importeCompra - descuentoTotal;
    }
}

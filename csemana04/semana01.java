
package csemana04;
import java.util.Scanner;
/**
 *
 * @author angyn
 */
public class semana01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar al usuario el monto total de dinero a invertir
        System.out.print("Ingrese el monto total de dinero a invertir: ");
        double montoTotal = teclado.nextDouble();

        // Calcular el monto a gastar en cada rubro
        double alquiler = montoTotal * 0.23;
        double publicidad = montoTotal * 0.07;
        double transporte = montoTotal * 0.26;
        double serviciosFeriales = montoTotal * 0.12;
        double decoracion = montoTotal * 0.21;
        double gastosVarios = montoTotal * 0.11;

        // Mostrar los resultados
        System.out.println("Monto a gastar en cada rubro:");
        System.out.println("Alquiler de espacio en la feria: " + alquiler);
        System.out.println("Publicidad: " + publicidad);
        System.out.println("Transporte: " + transporte);
        System.out.println("Servicios feriales: " + serviciosFeriales);
        System.out.println("Decoración: " + decoracion);
        System.out.println("Gastos varios: " + gastosVarios);

        teclado.close();
    }
}


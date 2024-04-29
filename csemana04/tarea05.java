/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csemana04;
import java.util.Scanner;

public class tarea05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horasTrabajadas;
        double salarioPorHora, salarioTotal;

        horasTrabajadas = leerHorasTrabajadas(teclado);
        salarioPorHora = leerSalarioPorHora(teclado);

        salarioTotal = calcularSalarioTotal(horasTrabajadas, salarioPorHora);
        imprimirSalarioTotal(salarioTotal);
    }

    static int leerHorasTrabajadas(Scanner teclado) {
        System.out.println("Ingrese las horas trabajadas: ");
        return teclado.nextInt();
    }

    static double leerSalarioPorHora(Scanner teclado) {
        System.out.println("Ingrese el salario por hora: ");
        return teclado.nextDouble();
    }

    static double calcularSalarioTotal(int horasTrabajadas, double salarioPorHora) {
        double salarioTotal = 0;

        if (horasTrabajadas > 40) {
            int horasNormales = 40;
            int horasExtras = horasTrabajadas - 40;

            if (horasExtras <= 8) {
                salarioTotal = horasNormales * salarioPorHora + horasExtras * salarioPorHora * 2;
            } else {
                int horasExtrasDobles = 8;
                int horasExtrasTriples = horasExtras - 8;
                salarioTotal = horasNormales * salarioPorHora + horasExtrasDobles * salarioPorHora * 2 + horasExtrasTriples * salarioPorHora * 3;
            }
        } else {
            salarioTotal = horasTrabajadas * salarioPorHora;
        }

        return salarioTotal;
    }

    static void imprimirSalarioTotal(double salarioTotal) {
        System.out.println("El salario total es: $" + salarioTotal);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class CalculoComisiones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el sueldo base del vendedor: ");
        double sueldoBase = scanner.nextDouble();

        System.out.println("Ingrese el monto de la venta 1: ");
        double venta1 = scanner.nextDouble();

        System.out.println("Ingrese el monto de la venta 2: ");
        double venta2 = scanner.nextDouble();

        System.out.println("Ingrese el monto de la venta 3: ");
        double venta3 = scanner.nextDouble();

        double comision = (venta1 + venta2 + venta3) * 0.1;
        double salarioTotal = sueldoBase + comision;

        System.out.println("El vendedor recibirá " + comision + " por comisiones por sus ventas del mes.");
        System.out.println("El salario total del vendedor será de " + salarioTotal + ".");
    }
}

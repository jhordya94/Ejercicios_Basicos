/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class CalculoDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el total de la compra: ");
        double totalCompra = scanner.nextDouble();

        double descuento = totalCompra * 0.15;
        double precioFinal = totalCompra - descuento;

        System.out.println("El descuento de la compra es de " + descuento + ".");
        System.out.println("El precio final de la compra es de " + precioFinal + ".");
    }
}


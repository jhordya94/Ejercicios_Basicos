/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class CalculoRaizCuadradaCubica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        double numero = scanner.nextDouble();

        double raizCuadrada = Math.sqrt(numero);
        double raizCubica = Math.cbrt(numero);

        System.out.println("La raíz cuadrada de " + numero + " es " + raizCuadrada);
        System.out.println("La raíz cúbica de " + numero + " es " + raizCubica);
    }
}


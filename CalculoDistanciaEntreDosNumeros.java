/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class CalculoDistanciaEntreDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double distancia = Math.abs(numero1 - numero2);

        System.out.println("La distancia entre los números es: " + distancia);
    }
}


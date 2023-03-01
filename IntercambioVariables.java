/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class IntercambioVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de A: ");
        int a = scanner.nextInt();

        System.out.println("Ingrese el valor de B: ");
        int b = scanner.nextInt();

        // Intercambio de valores utilizando una variable auxiliar
        int auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.println("Después del intercambio:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}


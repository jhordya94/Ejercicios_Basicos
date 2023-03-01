/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("La media de " + num1 + ", " + num2 + " y " + num3 + " es: " + media);
    }
}


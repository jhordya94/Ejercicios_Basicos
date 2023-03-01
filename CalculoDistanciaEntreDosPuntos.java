/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class CalculoDistanciaEntreDosPuntos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la coordenada x del primer punto: ");
        double x1 = scanner.nextDouble();

        System.out.println("Ingrese la coordenada y del primer punto: ");
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese la coordenada x del segundo punto: ");
        double x2 = scanner.nextDouble();

        System.out.println("Ingrese la coordenada y del segundo punto: ");
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }
}

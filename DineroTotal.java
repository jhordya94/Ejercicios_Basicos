
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */


public class DineroTotal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar al usuario la cantidad de monedas de cada denominación
        System.out.println("Introduce el número de monedas de 2 euros: ");
        int num2Euros = input.nextInt();

        System.out.println("Introduce el número de monedas de 1 euro: ");
        int num1Euro = input.nextInt();

        System.out.println("Introduce el número de monedas de 50 centimos: ");
        int num50Cent = input.nextInt();

        System.out.println("Introduce el número de monedas de 20 centimos: ");
        int num20Cent = input.nextInt();

        System.out.println("Introduce el número de monedas de 10 centimos: ");
        int num10Cent = input.nextInt();

        // Calcular el dinero total en euros y centimos
        int dineroEnCentimos = num2Euros * 200 + num1Euro * 100 + num50Cent * 50 + num20Cent * 20 + num10Cent * 10;
        int euros = dineroEnCentimos / 100;
        int centimos = dineroEnCentimos % 100;

        // Mostrar el dinero total en la pantalla
        System.out.println("Tienes " + euros + " euros y " + centimos + " centimos.");

    }
}

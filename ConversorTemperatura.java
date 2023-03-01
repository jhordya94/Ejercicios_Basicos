/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        //bibliografia : https://www.google.com/search?q=convertir+de+farenheit+a+centigrados&oq=convertir+de+fare&aqs=chrome.0.0i512j69i57j0i512j0i10i512j0i512l2.6203j0j4&sourceid=chrome&ie=UTF-8
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " grados Fahrenheit son equivalentes a " + celsius + " grados Celsius.");
    }
}


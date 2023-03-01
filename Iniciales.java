/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class Iniciales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = input.nextLine();

        System.out.println("Introduce tu primer apellido: ");
        String apellido1 = input.nextLine();

        System.out.println("Introduce tu segundo apellido: ");
        String apellido2 = input.nextLine();

        // Obtener la inicial de cada palabra y concatenarlas
        //Bibliografia : https://www.javatpoint.com/post/java-character-tostring-method y https://guru99.es/string-charat-method-java/
        
        String iniciales = Character.toString(nombre.charAt(0)) + Character.toString(apellido1.charAt(0)) + Character.toString(apellido2.charAt(0));

        System.out.println("Tus iniciales son: " + iniciales);

        
    }
}


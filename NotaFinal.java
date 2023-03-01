/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class NotaFinal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el número total de preguntas: ");
        int totalPreguntas = input.nextInt();

        System.out.println("Introduce el número de respuestas correctas: ");
        int respuestasCorrectas = input.nextInt();

        System.out.println("Introduce el número de respuestas incorrectas: ");
        int respuestasIncorrectas = input.nextInt();

        // Calcular la nota final
        int notaFinal = respuestasCorrectas * 5 - respuestasIncorrectas;

        // Asegurarse de que la nota final no sea menor que cero
        notaFinal = Math.max(notaFinal, 0);

        // Mostrar la nota final en la pantalla
        System.out.println("Tu nota final es: " + notaFinal);

    }
}

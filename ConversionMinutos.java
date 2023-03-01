/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class ConversionMinutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de minutos: ");
        int minutos = scanner.nextInt();

        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        System.out.println(minutos + " minutos son equivalentes a " + horas + " horas y " + minutosRestantes + " minutos.");
    }
}


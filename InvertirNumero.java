/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número de dos cifras: ");
        int numero = scanner.nextInt();

        int decenas = numero / 10;
        int unidades = numero % 10;
        int numeroInvertido = unidades * 10 + decenas;

        System.out.println("El número invertido es: " + numeroInvertido);
    }
}


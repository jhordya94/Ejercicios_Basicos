/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class Ciclista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce la hora de partida (HH MM SS): ");
        int hh = input.nextInt();
        int mm = input.nextInt();
        int ss = input.nextInt();

        System.out.println("Introduce el tiempo de viaje en segundos: ");
        int t = input.nextInt();

        // Convertir la hora de partida a segundos
        int partidaEnSegundos = hh * 3600 + mm * 60 + ss;

        // Calcular la hora de llegada en segundos
        int llegadaEnSegundos = partidaEnSegundos + t;

        // Convertir la hora de llegada a horas, minutos y segundos
        int hora = llegadaEnSegundos / 3600;
        int minutos = (llegadaEnSegundos % 3600) / 60;
        int segundos = llegadaEnSegundos % 60;
        // BIBLIOGRAFIA : https://stackoverflow.com/questions/3377688/what-do-these-symbolic-strings-mean-02d-01d
        System.out.printf("El ciclista llegará a las %02d:%02d:%02d", hora, minutos, segundos);

        
    }
}


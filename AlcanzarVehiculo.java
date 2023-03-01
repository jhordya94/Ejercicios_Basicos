/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AlcanzarVehiculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la distancia entre los dos vehículos en kilómetros: ");
        double distanciaKm = sc.nextDouble();

        System.out.println("Ingrese la velocidad del vehículo más lento en km/h: ");
        double velocidadLentaKmH = sc.nextDouble();

        System.out.println("Ingrese la velocidad del vehículo más rápido en km/h: ");
        double velocidadRapidaKmH = sc.nextDouble();

        // Convertir distancia y velocidad a unidades del SI
        double distanciaM = distanciaKm * 1000;
        double velocidadLentaMs = velocidadLentaKmH * 1000 / 3600;
        double velocidadRapidaMs = velocidadRapidaKmH * 1000 / 3600;

        // Calcular tiempo en segundos
        double tiempoSegundos = distanciaM / (velocidadRapidaMs - velocidadLentaMs);

        // Convertir tiempo a minutos y segundos
        long minutos = TimeUnit.SECONDS.toMinutes((long) tiempoSegundos);
        long segundos = (long) (tiempoSegundos - TimeUnit.MINUTES.toSeconds(minutos));

        System.out.printf("El vehículo más rápido alcanzará al otro en %d minutos y %d segundos.", minutos, segundos);

    }
}

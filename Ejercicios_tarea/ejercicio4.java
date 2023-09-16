package Ejercicios_tarea;

import java.util.Scanner;

public class ejercicio4 {
    //Calcular el número de dígitos en un número entero.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número entero: ");
        int numero = sc.nextInt();
        
        //para que también cuente negativos
        int numeroPositivo = Math.abs(numero);

        int contador = 0;

        while (numeroPositivo > 0) {
            numeroPositivo /= 10;
            contador++;
        }

        System.out.println("El número de dígitos en " + numero + " es: " + contador);
    }
}

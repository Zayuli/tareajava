package Ejercicios_tarea;

import java.util.Scanner;

public class ejercicio2 {
    //Verificar si un número es par o impar
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }
}

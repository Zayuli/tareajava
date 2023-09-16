package Ejercicios_tarea;

import java.util.Scanner;

public class ejercicio3 {
    //Verificar si un número es positivo, negativo o cero
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es iagual a cero.");
        }

    }
}

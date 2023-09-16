package Ejercicios_tarea;

import java.util.Scanner;

public class ejercicio5 {
    //Calcular el promedio de un arreglo de números
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el tamaño del arreglo: ");
        int tamano = sc.nextInt();

        double[] numeros = new double[tamano];

        System.out.println("Ingresa los número uno por uno: ");
        for (int i = 0; i < tamano; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        double suma =  0;
        for (int i = 0; i < tamano; i++) {
            suma += numeros[i];
        }

        double promedio = suma / tamano;

        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
}

package Ejercicios_tarea;
import java.util.Scanner;

public class ejercicio1 {
    //Calcular el área de un círculo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el valor del radio del círculo: ");
        int radio = sc.nextInt();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo con radio " + radio + " es: " + area);


    }
}

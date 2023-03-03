package com.mycompany.ejercicio_14;

import java.util.Scanner;
public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Ingrese el valor del número:");
        x = input.nextInt();
        System.out.println("El cuadrado de " + x + " es: " + Math.pow(x,2));
        System.out.println("El cubo de " + x + " es: " + Math.pow(x,3));
    }
}

package com.campusdual.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero;
        System.out.println("Escriba un número entre 1 y 20");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        switch(numero){
            case 2:
            case 3:
            case 5:
            case 7:
            case 11:
            case 13:
            case 17:
            case 19:
                System.out.println("O número " + numero + " é primo");
                break;
            default:
                System.out.println("O número " + numero + " non é primo");
        }
    }
}

package com.campusdual.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Integer anho;
        System.out.println("Escriba un ano");
        Scanner teclado = new Scanner(System.in);
        anho = teclado.nextInt();
        if(anho % 4 == 0){
                if(anho % 100 == 0 && anho % 400 != 0){
                    System.out.println("O ano " + anho + " non é un ano bisiesto");
                }else{
                    System.out.println("O ano " + anho + " é un ano bisiesto");
                }
        }else{
            System.out.println("O ano " + anho + " non é un ano bisiesto");
        }
    }
}

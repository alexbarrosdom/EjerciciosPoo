package com.campusdual.ejercicio4;

import java.util.Scanner;

public class DietProgram {
    public void showMenuProgram(){

        Scanner scanner = new Scanner(System.in);
        Integer option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("1.Crear/reiniciar dieta");
                    //método de crear/reiniciar dieta
                    break;
                case 2:
                    System.out.println("2. Mostrar información da dieta");
                    //método para mostrar a información da dieta
                    break;
                case 3:
                    System.out.println("3. Engadir alimento");
                    //método para engadir un alimento á dieta actual e engadir dito alimento á lista de alimentos dispoñibles
                    break;
                case 4:
                    System.out.println("4. Saír");
                    break;
                default:
                    System.out.println("Grazas por usar o programa, ata pronto");
                    break;
            }

    }

}

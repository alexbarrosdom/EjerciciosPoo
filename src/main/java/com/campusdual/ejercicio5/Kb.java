package com.campusdual.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kb { //Clase para engadir utilidades ao noso programa

    public static Integer getOption(Integer min,Integer max){ //teñen que ser todos estáticos porque non os estamos instanciando, só chamando á clase
        Integer option = 0;
        Boolean notvalid = true;
        do{
            try {
                option = Kb.forceNextInt();
                notvalid = option<min || option>max;
            }catch (InputMismatchException e){
                System.out.println("A opción debe ser un número");
                Kb.nextLine();
            }
            if(notvalid){
                System.out.println("Opción non válida, requírese un número entre "+min+" y "+max);
            }
        }while(notvalid);
        return option;
    }
    public static Integer nextInt(){
        Scanner keyboard = new Scanner(System.in);
        String resultString = keyboard.nextLine();
        Integer result = 0;
        try{
            result = Integer.parseInt(resultString);
        }catch (Exception e){
            throw new InputMismatchException();
        }
        return result;
    }

    public static Integer forceNextInt(){
        Integer resultado = null;
        boolean notvalid=true;
        do {
            try {
                resultado = nextInt();
                notvalid=false;
            } catch (InputMismatchException e) {
                System.out.println("É necesario que sexa un número");
            }
        }while(notvalid);
        return resultado;
    }

    public static String nextLine(){
        Scanner keyboard = new Scanner(System.in);
        String result = keyboard.nextLine();
        return result;
    }
}

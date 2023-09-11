package com.campusdual.ejemplos.alimentos;

public class FoodUtility {
    public static void main(String[] args) {
        Food zanahoria = new Food(12, 0,1);
        System.out.println("100 g de zanahoria contienen " + zanahoria.getCalories(100) + " calorías");

        Food bistec = new Food(0,15,27);
        System.out.println("100 g de bistec contienen " + bistec.getCalories(100) + " calorías");

        Food lechuga = new Food();
            lechuga.setCarbos(1);
            lechuga.setFats(0);
            lechuga.setProteins(0);
        System.out.println("100 g de lechuga contienen " + lechuga.getCalories(100) + " calorías");

    }
}

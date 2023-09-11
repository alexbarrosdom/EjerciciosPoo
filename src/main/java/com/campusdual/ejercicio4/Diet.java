package com.campusdual.ejercicio4;

import java.util.ArrayList;
import java.util.List;

/*
* Escribe una clase dieta, que teniendo en cuenta una serie de alimentos, vaya sumando cantidades en gramos y calcule cuentas calorías, carbohidratos, proteinas y grasas genera la ingesta
La clase dieta tiene que tener las siguientes funcionalidades:
	-Diet(): crea una dieta sin límite de calorías
	-Diet(Integer maxCalories): crea una dieta con un máximo de calorías, en cuanto se supera ese máximo cuando se adjunta un alimento se despliega un error
	-Diet(Integer maxFats, Integer maxCarbs, Integer maxProtein): crea una dieta con un máximo de estos tres valores, si se supera alguno de ellos cuando se adjunta un alimento se indicara que macronutriente y desplegará un error
	-Diet(Boolean women, Integer age, Integer height, Integer weight): Calcula el metabolismo basal de la persona y lo asigna como máximo de calorías en la dieta
		--CALCULAR METABOLISMO BASAL
			E = edad
			A = altura en centímetros
			P = peso en kilos

			Fórmula Hombres: TMB = 10P + 6,25A – 5E + 5
			Fórmula Mujeres: TMB = 10P + 6,25A – 5E – 161
	-addFood(Food,Integer): agrega un alimento y una cantidad en gramos
	-getTotalCalories(): devuelve el total de calorías
	-getTotalCarbs(): devuelve el total de carbohidratos
	-getTotalFats(): devuelve el total de grasas
	-getTotalProteins(): devuelve el total de proteinas
*
* */
public class Diet {
    private Integer maxCalories;
    private Integer maxCarbs;
    private Integer maxFats;
    private Integer maxProteins;
    private List<Intake> intakes;

    public Diet(){
        this.intakes = new ArrayList<>();
    }

    public Diet(Integer maxCalories){
        this.maxCalories=maxCalories;
        this.intakes = new ArrayList<>();
    }

    public Diet(Integer maxFats, Integer maxCarbs, Integer maxProteins){
        this.maxCarbs=maxCarbs;
        this.maxFats=maxFats;
        this.maxProteins=maxProteins;
        this.intakes = new ArrayList<>();
    }

    public Diet(Boolean women, Integer age, Integer height, Integer weight){
        if(women){
            maxCalories = (int) ((10*weight) + (6.25*height))-(5*age)-161;
        }else{
            maxCalories = (int) ((10*weight) + (6.25*height))-(5*age)+5;
        }
        this.intakes = new ArrayList<>();
    }
}

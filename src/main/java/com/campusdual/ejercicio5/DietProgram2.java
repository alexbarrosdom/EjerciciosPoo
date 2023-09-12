package com.campusdual.ejercicio5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DietProgram2 {

    Map<String, Diet> dietMap; //Declaración da variable dietMap da clase Map

    public DietProgram2() {
        dietMap = new HashMap<>(); //Instancia da variable dietMap -> creamos un obxecto deste tipo
    }

    public void showMenuProgram(){ //Menú principal, agora coas opcións novas
        System.out.println("########################################################");
        System.out.println("################# Programa de dietas ###################");
        System.out.println("########################################################");
        Integer option;
        do{
            System.out.println("Escolla unha opción:");
            System.out.println("===================================");
            System.out.println("1-Xestionar unha dieta");
            System.out.println("2-Xestionar un paciente");
            System.out.println("3-Saír do programa");
            option = Kb.getOption(1,3); //1. Xestión de dietas 2.Xestión de pacientes 3.Saír
            switch (option){
                case 1:
                    dietManager(); //Método de xestión de dietas
                    break;
                case 2:
                   patientManager(); //Método de xestión de pacientes
                    break;
                case 3:
                    System.out.println("Grazas por usar o programa, ata pronto :)"); //Saír
                    break;
            }
        }while(option != 3);
    }

    private void dietManager() {
        System.out.println("Aquí pode xestionar as dietas"); //TODO menú de dietas
        System.out.println("===================================");
        System.out.println("Escolla unha opción:");
        System.out.println("===================================");
        System.out.println("1-Engadir unha nova dieta");
        System.out.println("2-Mostrar os detalles dunha dieta");
        System.out.println("3-Eliminar unha dieta");
        System.out.println("4-Cancelar");
        Integer option = Kb.getOption(1,4);
        switch(option){
            case 1:
                addDiet(); //Método para engadir unha nova dieta
                break;
            case 2:
                showDietDetails(); //Método para mostrar os detalles da dieta
                break;
            case 3:
                deleteDiet(); //Método para eliminar unha dieta
                break;

        }
    }

    private String selectDiet(){ //Seleccionar dieta
        Integer containerNumber = 1; //Empezamos a lista en 1
        List<String> containerList = new ArrayList<>();
        for (String containerName: dietMap.keySet()){
            System.out.println(containerNumber + ": " + containerName);
            containerList.add(containerName);
            containerNumber++;
        }
        Integer option = Kb.getOption(1, containerNumber);
        return containerList.get(option-1);  // opcións
    } //TODO se containerNumber = option -> non escolleu nada, devolver null


    private void addDiet(){
        HashMap<Integer, String> dietList = new HashMap();
        //Engade unha dieta á lista.
        //Podemos reutilizar o menú antiguo de crear/reemplazar
        //TODO funcionalidade

    }

    private void showDietDetails(Diet diet){
        //Mostra os detalles dunha dieta e permite modificala
        //TODO funcionalidade
        if(diet!=null){
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("Detalles de la dieta");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            if(diet.getMaxCalories()!=null){
                System.out.println("El número máximo de calorías es:"+diet.getMaxCalories());
            }
            if(diet.getMaxCarbs() != null || diet.getMaxFats() != null || diet.getMaxProteins() != null){
                System.out.println("Los valores máximos de macronutrientes son: Carbohidratos:"+diet.getMaxCarbs()+" , Grasas:"+diet.getMaxFats()+" , Proteinas:"+diet.getMaxProteins());
            }
            System.out.println("Número de alimentos de la dieta:"+diet.getFoodNumber());
            System.out.println("Calorías:"+diet.getTotalCalories());
            System.out.println("Carbohidratos:"+diet.getTotalCarbs());
            System.out.println("Grasas:"+diet.getTotalFats());
            System.out.println("Proteínas:"+diet.getTotalProteins());
            System.out.println("Alimentos de la dieta:"+diet.getDietIntakes());
        }else{
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("La dieta no esta iniciada");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }
    }

    private void deleteDiet(){
        //Elimina unha dieta da lista(sempre que non a teña asignada un paciente)
        //TODO asegurarse de que non está asignada a ningún paciente + funcionalidade
    }

    private void patientManager() {
        System.out.println("Aquí pode xestionar os pacientes"); //TODO menú de pacientes
        System.out.println("===================================");
        System.out.println("Escolla unha opción:");
        System.out.println("===================================");
        System.out.println("1-Dar de alta un paciente");
        System.out.println("2-Mostrar os detalles dun paciente");
        System.out.println("3-Asignar unha dieta");
        System.out.println("4-Dar de baixa a un paciente");
        System.out.println("5-Cancelar");
        Integer option = Kb.getOption(1,5);
        switch(option){
            case 1:
                addPatient(); //Método para dar de alta un paciente
                break;
            case 2:
                showPatientDetails(); //Método para mostrar os detalles dun paciente
                break;
            case 3:
                asignDietToPatient(); //Método para asignar unha dieta a un paciente
                break;
            case 4:
                deletePatient(); //Método para dar de baixa a un paciente
                break;
        }
    }


    private void addPatient() {
        //atributos: nome, apelidos, peso, altura, idade e sexo.
        //Ten que engadir un paciente novo á lista de pacientes
        //TODO funcionalidade
    }

    private void showPatientDetails() {
        //Amosará os detalles dun paciente, así como todas as súas dietas listadas de luns a domingo
        //TODO funcionalidade
    }

    private void asignDietToPatient() {
        //Amosa a lista de dietas xeral e pode asignarlle unha a un día da semana do paciente.
        //TODO funcionalidade
    }

    private void deletePatient() {
        //Elimina los datos de un paciente
        // (Non borra as súas dietas asignadas, xa que poden estar asignadas a outro paciente)
        //TODO funcionalidade
    }


}

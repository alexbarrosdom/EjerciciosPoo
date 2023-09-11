package com.campusdual.ejemplos.alimentos;

public class Food {
    private Integer carbos;
    private Integer fats;
    private Integer proteins;

    public Food(){ //construtor dun alimento baleiro, logo pódense modificar os seus valores cos setters e logo obter os seus valores cos getters
        this.carbos = 0;
        this.fats = 0;
        this.proteins = 0;
    }

    public Food (Integer carbos, Integer fats, Integer proteins){ //construtor dun alimento cos seus valores de carbos, graxas e proteínas
        this.carbos = carbos;
        this.fats = fats;
        this.proteins = proteins;
    }
    public Integer getCalories(Integer weight){
        //1 gramo de carbohidratos dá 4 calorías
        //1 gramo de grasa dá 9 calorías
        //1 gramo de proteínas dá 4 calorías
        return ((carbos * 4) + (fats * 9) + (proteins * 4));
    }

    /*public static Integer getCalories(Integer weight, Integer carbos, Integer fats, Integer protein){
        return ((carbos * 4) + (fats * 9) + (proteins * 4));
    }

    public static Integer sumCalories(Integer weight, Food otherFood){
        Integer newcarbos = this.carbos + otherFood.carbos;
        Integer newfats = this.fats + otherFood.fats;
        Integer newproteins = this.proteins + otherFood.proteins;
        return ((carbos * 4) + (fats * 9) + (proteins * 4)*weight/100);
    }*/

    public Integer getCarbos() {
        return carbos;
    }

    public void setCarbos(Integer carbos) {
        this.carbos = carbos;
    }

    public Integer getFats() {
        return fats;
    }

    public void setFats(Integer fats) {
        this.fats = fats;
    }

    public Integer getProteins() {
        return proteins;
    }

    public void setProteins(Integer proteins) {
        this.proteins = proteins;
    }
}

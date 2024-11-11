package test;

public class Asiento{
    //Atributos
    String color;
    int precio;
    int registro;

    //Metodo
    void cambiarColor(String color){
        if (color == "rojo" || color == "verde" || color == "amarillo" || color =="negro" || color == "blanco"){
            this.color = color;
        }
        
    }
}
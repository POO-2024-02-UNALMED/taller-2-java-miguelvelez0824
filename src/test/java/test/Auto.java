package test;

public class Auto {
    //atributos
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    //metodos
    int cantidadAsientos(){
        int NumAsientos = 0;

        for(int i = 0; i < asientos.length; i++){
            if (asientos[i] != null){
                NumAsientos ++;
            }
        }
        return NumAsientos;
    }

    String verificarIntegridad(){
        if(this.registro == this.motor.registro){
            for(int i = 0; i < this.asientos.length; i++){
                if(asientos[i] != null){
                    if(this.registro != this.asientos[i].registro){
                        return "las piezas no son originales";
                    }
                }
            }
            return "Auto original";
        }
        return "las piezas no son originales";
    }
}
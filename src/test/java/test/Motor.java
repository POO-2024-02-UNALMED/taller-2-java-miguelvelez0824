package test;

public class Motor {
    //atributos
    int numeroCilindros;
    String tipo;
    int registro;

    //metodos
    void cambiarRegistro(int registro){
        this.registro = registro;
    }

    void asignarTipo(String tipo){
        if(tipo == "gasolina" || tipo == "electrico"){
            this.tipo = tipo;
        }
    }
}

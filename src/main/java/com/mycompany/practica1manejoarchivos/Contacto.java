package com.mycompany.practica1manejoarchivos;

public class Contacto {
    
    public String nombre;
    public String numero;
    public String red1;
    public String red2;

    public Contacto(String nombre, String numero, String red1, String red2) {
        this.nombre = nombre;
        this.numero = numero;
        this.red1 = red1;
        this.red2 = red2;
    }

    @Override
    public String toString() {
        return nombre+"|"+numero+"|"+red1+"|"+red2;
    }
    
    
}

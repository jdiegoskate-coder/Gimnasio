package com.ejemplo.Gimnasio;

public class Miembro {

    private String nombre;
    private int edad;

    public Miembro(String nombre , int edad) {
        this.nombre = nombre;
        SetEdad(edad);
    }

    public String getNombre(){
        return nombre;
    }

    public int edad () {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public double cuotaMensual() {
        return 50000;
    }

    public string descripcion (){
        return nombre +" (" + edad + "años)";
    }

}

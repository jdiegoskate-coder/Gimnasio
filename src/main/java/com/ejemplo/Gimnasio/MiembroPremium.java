package com.ejemplo.Gimnasion;

public class MiembroPremium extends Miembro {

    Private String entrenadorPersonal;

    public MiembroPremium(String nombre, int edad, string entrenadorPersonal){
        super(nombre, edad);
        this.entrenadorPersonal = entrenadorPersonal;

    }

    public string getEntrenadorPersonal() {
        return entrenadorPersonal;
    }

    @override

    public double cuotaMensual() {
        return super.cuotaMensual() + 30.000;
    }
}


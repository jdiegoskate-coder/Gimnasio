package com.ejemplo.Gimnasio;

public class MiembroEstudiante extends Miembro {

    private string universidad;

    public MiembroEstudiante(string nombre, int edad, string universidad){
        super(nombre,edad);
        this.universidad = universidad;
    }

    public string getUniversidad (){
        return universidad;
    }

    @override 

    public double cuotaMensual(){
        return super.cuotaMensual() - 15.000;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelapracticarecu;
import java.io.Serializable;

/**
 *
 * @author ALIS
 */
public class Profesor extends Persona implements Serializable{
    //-Atributos 
    private String profesion;
    private int salario = 0;
    
    //-Constructor
    public Profesor (int id, String nombre, String apellido,int edad, String profesion,int salario) {
    super(id, nombre, apellido, edad);
    this.profesion = profesion;
    this.salario = salario;  
    }
    //-Getters & Setters

    public String getProfesion() {
        return profesion;
    }

    public int getSalario() {
        return salario;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
 
    //-Mètodo
    @Override
    public void mostrarInformacion(){
        System.out.println("Datos del profesor: ");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Profesion: " + profesion);
        System.out.println("Salario: " + salario);
        
    };
}

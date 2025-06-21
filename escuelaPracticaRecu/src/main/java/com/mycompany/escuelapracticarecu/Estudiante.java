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
public class Estudiante extends Persona implements Serializable {
    
    //Atributos
    private String carnet;
    private String carrera;
    
    //Constructor 
    public Estudiante(int id, String nombre, String apellido, int edad, String carnet, String carrera) {
     super(id, nombre, apellido, edad);//Con el atributo Super, llamamos al constructor de la clase padre
     //En este sentido, solo llenaremos los parametros del Super con los atributos del padre        
    //-Va una vez hecho eso, pasamos a utilizar el metodo this, para esta clase
    this.carnet = carnet;
    this.carrera = carrera; 
    }
  
    //Getters and Setters
    //-Carnet
    public String getCarnet() {
        return carnet;
    }
    public String setCarnet(String carnet) {
        this.carnet = carnet;
        return null;
    }
    //-Carrera
    public String getCarrera() {
        return carrera;
    }
    public String setCarrera(){
        this.carrera = carrera;
        return null;
    }
    //Metodo 
    @Override/*Creo que el override esta mal, ¿no? Corrigeme mi cieloo*/ 
    public void mostrarInformacion(){
        //Llenemos
        System.out.println("Datos del Estudiante");
        //Listamos Datos
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Carnet: " + carnet);
        System.out.println("Carrera: " + carrera);
        
    };   
    
}

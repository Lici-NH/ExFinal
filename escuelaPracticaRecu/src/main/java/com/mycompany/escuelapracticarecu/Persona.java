/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelapracticarecu;

/**
 *
 * @author ALIS
 */
public abstract class Persona {
    
    //Atributos 
    private int id; 
    private String nombre;
    private String apellido;
    private int edad;
    
    //Constructor
    public Persona(int id, String nombre, String apellido, int edad){
    
        this.id = id;
        this.nombre = nombre;
        this.apellido =  apellido;
        this.edad = edad;
    } 
    
    //Modificadores de Acceso: Getters y Setters
   //-Para ID
    public int getId() {
        return id;
    }
   public int setId(int id) {
        this.id = id;
        return 0;
   }
  //-Para nombre 
   public String getNombre (){ return nombre;}
   
   public String setNombre (String nombre ){
        this.nombre = nombre;
        return null;
   }
   //Para apellido
   public String getApellido(){return apellido;}
   
   public String setApellido() {
       this.apellido = apellido;
       return null;
   }
   //-Para edad
   public int getEdad(){return edad;}
   
   public int setEdad(int edad) {
       this.edad = edad; 
       return 0;} 
   
  //Método Abstracto
   public abstract void mostrarInformacion();
   
}

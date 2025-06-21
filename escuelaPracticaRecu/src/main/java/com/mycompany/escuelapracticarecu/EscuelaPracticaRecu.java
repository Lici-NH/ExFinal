/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escuelapracticarecu;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author ALIS
 */
public class EscuelaPracticaRecu {

    public static void main(String[] args){
    
    /*Primera funcionalidad dentro del Main
    la serializacion del objeto*/
    
    //Primero debemos crear un objeto tipo profesor
    Profesor profe1 = new Profesor( 1, "José", "Morales", 29, "Matematicas", 5000);
    //Qué joven es para ser profe jajajaja
    
    //Creamos un objeto tipo estudianteEstudiante
    Estudiante e1 = new Estudiante(01, "Alicia", "Sazo", 20, "S-7590", "Ingenieria en Sistemas" );
    Estudiante e2 = new Estudiante(02, "Iván", "Rodriguez", 21, "S-7540", "Ingenieria en Sistemas" );
    Estudiante e3 = new Estudiante(03, "Lucia", "Delgado", 20, "S-7550", "Ingenieria en Sistemas" );
    //--SERIALIZACION
    /* --Necista un flujo de salida de archivo-FileOutputStream
       --Encima de eso, un ObjectOutputStream
       --Archivo .ser, para convertir al objeto en una secuencia de bytes
        out.writeObject(profe1);
       --Cierre de los flujos  
            out.close();
            fileOut.close();
    */
    try {    
    FileOutputStream fileOut = new FileOutputStream ("Profesor.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut); 
        out.writeObject(profe1);
        out.close();
        fileOut.close();
    }
    catch(IOException i){
        i.printStackTrace();
    }
    
    //Serializacion de Estudiante:
    try{
    //Primero tenemos que escribir datos dentro de un archivo
    FileOutputStream fileOut = new FileOutputStream ("Estudiante.ser");
    //Guardamos objetos dentro de el
    ObjectOutputStream out = new ObjectOutputStream (fileOut);
    //Convertimos el objeto en bytes
    out.writeObject(e1);
    //Cerramos los canales
    out.close();
    fileOut.close();
    }
    catch(IOException i) {
        i.printStackTrace();
    }
    } 
    
    //Cola -Queue 

}
    
    
    
    


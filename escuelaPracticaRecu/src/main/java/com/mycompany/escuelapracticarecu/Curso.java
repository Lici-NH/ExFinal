/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelapracticarecu;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author ALIS
 */
public class Curso {
    //Atributos
    private int codigoCurso;
    private String nombreCurso;
    private String profesorAsignado;
    //Lista de estudiantes -- arrayList.. que no se como hacer jajaja
    //Creamos el ArrayList para guardar objetos del tipo estudiante
    private ArrayList<Estudiante> listaEstudiantes;
    private Queue <Estudiante> listaEspera;
    
    //Constructor
    public Curso(int codigoCurso, String nombreCurso, String profesorAsignado){
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.profesorAsignado = profesorAsignado;
        this.listaEstudiantes = new ArrayList<>();//Inicializamos
        this.listaEspera = new LinkedList<>();
    }
    //Getters & Setters
    public int getCodigoCurso() {
        return codigoCurso;
    }
    public String getNombreCurso() {
        return nombreCurso;
    }
    public String getProfesorAsignado() {
        return profesorAsignado;
    } 
      public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public void setProfesorAsignado(String profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }

    //Método
    public void agregarEstudiante(Estudiante e){
       /*Manejo de excepciones-> try, catch y throw IllegalArgumentException. 
        .getMessage() para jalarnos el mensaje del IllegalArgument*/
        
       /*En el try, va el codigo que puede fallar
       --Acá comparamos si algun dato ingresado es nulo
       */
       try  {
           //El if nos ayuda a comparar si e, donde se ingresan 
           //los datos del estudiante son nulos o no existentes
           if(e == null){
               //Lanzamos un mensaje de error personalizado
           throw new IllegalArgumentException("El dato a ingresar es nulo");
           }
           
           //Ahora vamos a darle funcionalidad a la cola
           /*Primero vamos a agregar una condicion para evaluar si 
           el estudiante puede ingresar al listado*/
           if(listaEstudiantes.size() < 3){
           //Dentro del try intentamos implementar la funcionalida del metodo
          //Acá llamamos a la lista y utilizaremos el metodo Add del 
           //ArrayList
            listaEstudiantes.add(e);
            //Print para decir que ya ha sido agregado exitosamente
            System.out.println("El estudiante ha sido agregado correctamente.");
           }
           else //en dado caso ya no quepa y deba ser mandado a lista de espera
           {
               listaEspera.offer(e); /*llamar a la lista de espera
           para no perder al estudiante, y con el metodo offer lo agregamos
               al fianl de la cola de espera*/
               System.out.println("Curso lleno. Estudiante ingresado a lista de espera");
               }        
       }   
        //Parametro del catch dependera del mensaje de error personalizado
        //que tenga el throw new
       catch(IllegalArgumentException ex) {
               /*Lanzamos otro mensaje de error para que sepan que no 
               se pudo ingresar el dato*/
               System.out.println("Los datos no han podido ser ingresados" + ex.getMessage());
       }
    };
    
    public void removerEstudiante(int idEstudiante){
        /*Try, Catch, Throw new IllegalArgumentException */
        
        //--> Primero vamos a implementar el try
        try{
         /*Inicializamos este boleano para que lo podamos usar en el throw*/
         boolean encontrado = false;      
        //Recorrer la lista de estudiantes
        for(int i= 0; i< listaEstudiantes.size(); i++) {
        //Obtenemos al estudiante en la posicion deseada
        Estudiante e = listaEstudiantes.get(i);
        //Comparamos a ese estudiante obtenido 
        if(e.getId() == idEstudiante){
          //Removemos 
        listaEstudiantes.remove(e);
        //Cerramos el ciclo
        break;
            }      
            }  
        //If para comparar el encontrado y aca usamos el throw new
            /*Si encontrado es false o sigo siendo false lanzamos un mensaje de error*/
        if(!encontrado) {
            throw new IllegalArgumentException("El ID ingresado: " + idEstudiante + " no existe en la lista");
        }   
        }
        
        catch(IllegalArgumentException ex){
            System.out.println("El dato no ha podido ser ingresado. Intente de nuevo, por favor.");
        }
    };
    
    public void mostrarInformacionCurso(){
    
    //Mostramos los datos del curso
        System.out.println("Datos del Curso: ");
        //Listamos Datos
        System.out.println("Codigo curs: " + codigoCurso);      
        System.out.println("Nombre del curso: " + nombreCurso);
        System.out.println("Profesor asignado: " + profesorAsignado);
       
        //Mostrar a los estudiantes:
        System.out.println("Estudiantes inscritos: "); 
        for(Estudiante e: listaEstudiantes){
            e.mostrarInformacion();
        }     
    }
}
    
    

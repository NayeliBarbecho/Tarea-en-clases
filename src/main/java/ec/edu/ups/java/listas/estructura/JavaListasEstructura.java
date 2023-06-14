/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.java.listas.estructura;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class JavaListasEstructura {

    public static void main(String[] args) {

        //Instancia se las clases
        ColaTarea<String> colaTarea= new ColaTarea<>();
        ColaTarea<Integer> colaInt= new ColaTarea<>();
        ColaTarea<int[]> colaArregloEnteros= new ColaTarea<>();
        ColaTarea<String[]> colaArregloString= new ColaTarea<>();
        PilaTarea<Integer> pilaTarea= new PilaTarea<>();
         PilaTarea<ColaTarea> pilaTareaArreglo= new PilaTarea<>();
        
        //Instancias de tareas a la cola
        colaTarea.agregarTarea(new Tarea(1,"Tarea 1"));
        colaTarea.agregarTarea(new Tarea(2,"Tarea 2"));
        colaTarea.agregarTarea(new Tarea(3,"Tarea 3"));
        colaTarea.agregarTarea(new Tarea(4,"Tarea 4"));
        colaTarea.agregarTarea(new Tarea(5,"Tarea 5"));
        colaInt.agregarTarea(new Tarea(5,3));
        colaInt.agregarTarea(new Tarea(8,2));
        colaInt.agregarTarea(new Tarea(2,1));
        Tarea<int[]> t2=new Tarea(8,new int[]{212,78});
        colaArregloEnteros.agregarTarea(t2);
        Tarea<int[]> t3=new Tarea(9,new int[]{21,7});
        colaArregloEnteros.agregarTarea(t3);
        Tarea<int[]> t4=new Tarea(10,new int[]{22,8});
        colaArregloEnteros.agregarTarea(t4);
        Tarea<String[]> s1=new Tarea(11,new String[]{"juan","miguel","pepito"});
        colaArregloString.agregarTarea(s1);
        Tarea<String[]> s2=new Tarea(11,new String[]{"Sebas","Luna","Elias"});
        colaArregloString.agregarTarea(s2);
        Tarea<String[]> s3=new Tarea(11,new String[]{"Maria","Nube","Joel"});
        colaArregloString.agregarTarea(s3);
        pilaTarea.agregarTarea(new Tarea(6,6));
        pilaTarea.agregarTarea(new Tarea(7,7));
        pilaTarea.agregarTarea(new Tarea(8,8));
        //Procesar las tareas de las Cola<String>
        while(!colaTarea.estaVacia()){
            Tarea<String> tareaProcesada= colaTarea.procesarTarea();
            Tarea<int[]>  tareaEntera= colaArregloEnteros.procesarTarea();
            Tarea<String[]> tareaEnteraArreglo= colaArregloString.procesarTarea();
            System.out.println("Procesando tarea de la cola;\n\t Sale-->"+tareaProcesada.getId()+"-"+ tareaProcesada.getAtributo());
             
             
        }
        while(!colaArregloEnteros.estaVacia()){
            
            Tarea<int[]>  tareaEntera= colaArregloEnteros.procesarTarea();
            //int[]arreglo
            //System.out.println("Procesando tarea de la cola;\n\t Sale-->"+tareaProcesada.getId()+"-"+ tareaProcesada.getAtributo());
             
             
        }
        
        System.out.println("\n-----\n");
        while(!pilaTarea.estaVacia()){
            Tarea<Integer> tareaProcesada= pilaTarea.procesarTarea();
            System.out.println("Procesando tarea de la cola;\n\t Sale-->"+tareaProcesada.getId()+"-"+ tareaProcesada.getAtributo());
        }
        
    }
}

/*
 * Universidad del Valle de Guatemala
 * Estructura de datos
 * Seccion 10
 * Mario Perdomo 18029
 * Josue Sagastume 18173
 * Laboratorio 8
 * */
import java.util.*;
import java.io.*;

/**
 * Main de la hoja de Trabajo #8. Se logra hacer un menu para verificar
 * ambos casos de priorityQueue del simulador del hospital.
 */
public class MainHDT8{
    public static void main(String args[]){
        //Asignaciones de variables
        Scanner scan = new Scanner(System.in);
        PriorityQueue<Paciente> pQueue = new PriorityQueue<Paciente>();
        VectorHeap<Paciente> vHeap = new VectorHeap<Paciente>();
        Archivo archivo = new Archivo();
        //Print del sistema

        System.out.println(archivo.leerTexto("C:\\Users\\josue\\Documents\\GitHub\\HDT8_Estructuras\\pacientes.txt"));
        System.out.println("--------------------------------------------");
        System.out.println("Simulador del hosptial de Ciudad Vieja. \n");
        System.out.println("--------------------------------------------");
        int opcion = 0;
        while (opcion != 3){
            System.out.println("Ingrese las siguiente opcion que desea: 1. VectorHeap\n 2. PriorityQueue \n 3. Salir");
            opcion = scan.nextInt();
            switch (opcion){
                //VectorHeap
                case 1:
                    for (int i= 0; i < /*Lenght del texto*/;i++){
                        //Aqui se tiene que hacer que la clase Archivo.java pueda seperar el nomnre, descripcion y prioridad
                        //para poder colocarlos en la variable nuevo_paciente
                        Paciente nuevo_paciente = new Paciente(/*parametros: nombre,descripcion, prioridad */);
                        vHeap.add(nuevo_paciente);
                        //Ejemplo!
                        // Adding items to the pQueue using add()
                        // pQueue.add("C");
                        //pQueue.add("C++");
                        //pQueue.add("Java");
                        //pQueue.add("Python");
                    }
                    //Luego aqui se ordenan utilizando los metodos del vHeap
                    //Codigo....
                    break;
                //Java Collection PriorityQueue
                case 2:
                    for (int i= 0; i < /*Lenght del texto*/;i++){
                        //Aqui se tiene que hacer que la clase Archivo.java pueda seperar el nomnre, descripcion y prioridad
                        //para poder colocarlos en la variable nuevo_paciente
                        Paciente nuevo_paciente = new Paciente(/*parametros: nombre,descripcion, prioridad */);
                        vHeap.add(nuevo_paciente);
                    }
                    //Luego aqui se ordenan utilizando los metodos de pQueue
                    //Codigo....
                    break;
                //Salir del programa.
                case 3:
                    // Solo se sale del programa
                    break;
            }
        }

    }
}
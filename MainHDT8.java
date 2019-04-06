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
        //Archivo leer

        PriorityQueue<Paciente> pQueue = new PriorityQueue<Paciente>();


        // Adding items to the pQueue using x`add()

        VectorHeap<Paciente> vHeap = new VectorHeap<Paciente>();

        Archivo archivo = new Archivo();

        System.out.println(archivo.leerTexto("C:\\Users\\josue\\Documents\\GitHub\\HDT8_Estructuras\\pacientes.txt"));

        // Adding items to the pQueue using add()
       // pQueue.add("C");
        //pQueue.add("C++");
        //pQueue.add("Java");
        //pQueue.add("Python");
    }
}
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
public class MainHDT8{
    public static void main(String args[]){
        // Creating empty priority queue
        PriorityQueue<Paciente> pQueue = new PriorityQueue<Paciente>();
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
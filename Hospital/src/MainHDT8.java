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
    public static void main(String args[]) throws IOException {
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
                    try {
                        FileReader fr = new FileReader("C:\\\\Users\\\\josue\\\\Documents\\\\GitHub\\\\HDT8_Estructuras\\\\pacientes.txt");
                        //C:\\Users\\josue\\Documents\\GitHub\\HDT8_Estructuras\\pacientes.txt
                        BufferedReader br = new BufferedReader(fr);
                        String[] lista;

                        String cadena = br.readLine();
                        while (cadena != null) {
                            lista = cadena.split(",");
                            Paciente nuevo_paciente = new Paciente(lista[0], lista[1], lista[2].replaceAll("\\s+", "").charAt(0));
                                vHeap.add(nuevo_paciente);
                                // Adding items to the pQueue using add()
                                // pQueue.add("Java");

                            cadena = br.readLine();
                        }
                    } catch (Exception e){
                        System.out.println("No se encontro el archivo en la direccion ingresada");
                    }
                    break;
                //Java Collection PriorityQueue
                case 2:
                    try {
                        FileReader fr = new FileReader("C:\\\\Users\\\\josue\\\\Documents\\\\GitHub\\\\HDT8_Estructuras\\\\pacientes.txt");
                        //C:\\Users\\josue\\Documents\\GitHub\\HDT8_Estructuras\\pacientes.txt
                        BufferedReader br = new BufferedReader(fr);
                        String[] lista;

                        String cadena = br.readLine();
                        while (cadena != null) {
                            lista = cadena.split(",");
                            Paciente nuevo_paciente = new Paciente(lista[0], lista[1], lista[2].replaceAll("\\s+", "").charAt(0));
                                vHeap.add(nuevo_paciente);
                                // Adding items to the pQueue using add()
                                // pQueue.add("Java");
                            
                            cadena = br.readLine();
                        }
                    } catch (Exception e){
                        System.out.println("No se encontro el archivo en la direccion ingresada");
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
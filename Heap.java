//Extraido del libro: "Java Structures: Data Structures for the Principled Programmer, Seccion 14.4"
import java.util.*;

/**
 * Vector heap es otro tipo de PrioryQueue utilizando arboles.
 * @param <E> Objeto o dato primitivo
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E>{

    protected Vector<E> data; // the data, kept in heap order

    /**
     * Constructor del vectorHeap sin ningun parametro
     */
    public VectorHeap()
    // post: constructs a new priority queue
    {
        data = new Vector<E>();
    }

    /**
     * Otro constructor que recive como parametro un vector desordenado
     * @param Un vector desordenado
     */
    public VectorHeap(Vector<E> v)
    // post: constructs a new priority queue from an unordered vector
    {
        int i;
        data = new Vector<E>(v.size()); // we know ultimate size
        for (i = 0; i < v.size(); i++)
        { // add elements to heap
            add(v.get(i));
        }
    }

    /**
     * Padre de un nodo
     * @param i Posicion del nodo de un arbol
     * @return Devuelve el padre del onod ingresado
     */
    protected static int parent(int i)
    // pre: 0 <= i < size
    // post: returns parent of node at location i
    {
        return (i-1)/2;
    }

    /**
     * Nodo Izquierdo del nodo buscado
     * @param i Posicion del nodo de un arbol
     * @return Indice del nodo izquierdo en la localizacion de i
     */
    protected static int left(int i)
    // pre: 0 <= i < size
    // post: returns index of left child of node at location i
    {
        return 2*i+1;
    }

    /**
     * Nodo Derecho del nodo buscado.
     * @param i Posicion del nodo de un arbol
     * @return Indice del nodo derecho en la localizacion de i
     */
    protected static int right(int i)
    // pre: 0 <= i < size
    // post: returns index of right child of node at location i
    {
        return 2*(i+1);
    }
}


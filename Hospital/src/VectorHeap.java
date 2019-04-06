//Extraido del libro: "Java Structures: Data Structures for the Principled Programmer, Seccion 14.4"

import java.util.*;
/**
 * Vector heap es otro tipo de PrioryQueue utilizando arboles.
 * @param <E> Objeto o dato primitivo
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueueInterface<E>{
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
     * @param v Un vector de tipo E
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
    protected static int right(int i){
    // pre: 0 <= i < size
    // post: returns index of right child of node at location i
        return 2*(i+1);
    }

    @Override
    public E getFirst() {
        return data.get(0);
    }

    @Override
    public E remove() {
        E minVal = getFirst();
        data.set(0,data.get(data.size()-1));
        data.setSize(data.size()-1);
        if (data.size() > 1) pushDownRoot(0);
        return minVal;
    }

    protected void pushDownRoot(int raiz)
    // pre: 0 <= raiz < size
    // post: moves node at index root down to appropriate position in subtree
    {
        int heapSize = data.size();
        E valor = data.get(raiz);
        while (raiz < heapSize) {
            int poshijo = left(raiz);
            if (poshijo < heapSize)
            {
                if ((right(raiz) < heapSize) && ((data.get(poshijo+1)).compareTo(data.get(poshijo)) < 0)) {
                    poshijo++;
                }
                if ((data.get(poshijo)).compareTo(valor) < 0) {
                    data.set(raiz,data.get(poshijo));
                    raiz = poshijo;
                } else {
                    data.set(raiz,valor);
                    return;
                }
            } else {
                data.set(raiz,valor);
                return;
            }
        }
    }

    protected void percolateUp(int hoja)
    // pre: 0 <= leaf < size
    // post: moves node at index leaf up to appropriate position
    {
        int padre = parent(hoja);
        E value = data.get(hoja);
        while (hoja > 0 &&
                (value.compareTo(data.get(padre)) < 0))
        {
            data.set(hoja,data.get(padre));
            hoja = padre;
            padre = parent(hoja);
        }
        data.set(hoja,value);
    }

    @Override
    public void add(E value) {
        data.add(value);
        percolateUp(data.size()-1);
    }

    @Override
    public boolean isEmpty() {
        if (data.size()==0){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void clear() {

    }
}


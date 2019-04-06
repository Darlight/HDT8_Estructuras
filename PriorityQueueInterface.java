/**
 * Se usa para la interfaz del PriorityQueue.
 * Extraido de: "Java Structures: Data Structures for the Principled Programmer, Seccion 14.4"
 * @param <E> Cualquier objeto o dato primitivo
 */
public interface PriorityQueue<E extends Comparable<E>>{
    /**
     * @return Devuelve el primer dato de prioridad
     */
    public E getFirst();

    /**
     * Remueve un objeto del Priority
     * @return PrioriQueue
     */
    public E remove();


    /**
     * Agrega un objeto al PriorityQueue
     * @param value Objeto o dato primitivo
     */
    public void add(E value);

    /**
     * Verifica si esta vacio el PriorityQueue
     * @return Devuelve un false o true. Verdadero si esta vacio, falso de lo contrario.
     */
    public boolean isEmpty();

    /**
     * Devuelve el tamaño del PriorityQueue
     * @return Un int del tamaño del PriorityQueue
     */
    public int size();

    /**
     * Remueve todos los elementos del PriorityQueue
     */
    public void clear();
}
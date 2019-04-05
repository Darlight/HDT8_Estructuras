public interface PriorityQueue<E extends Comparable<E>>{
    public E getFirst();
    //pre: !isEmpty()
    //post: regresa el valor minimo en la priority queue

    public E remove();
    //pre: !isEmpty()
    //post; regresa y remueve el valor minimo de la queue

    public void add(E value);
    //pre: value is non-null comparable
    //post: el valor es agregado a la priority queue

    public boolean isEmpty();
    //post: regresa verdadero si no hay elementos en la queue

    public int size();
    //post: regresa el numero de elementos dentro de la queue

    public void clear();
    //post: remueve todos los elementos de la queue
}
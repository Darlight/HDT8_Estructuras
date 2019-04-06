
import java.util.*;

/**
 * Clase de un paciente
 */
public class Paciente implements Comparable<Paciente>{
    String nombre_paciente;
    String descripcion_paciente;
    char nivel_paciente;

    /**
     * Constructor del Paciente
     * @param nombre El nombre del paciente
     * @param descripcion Descripcion de su estatus
     * @param nivel Nivel de prioridad
     */
    public Paciente(String nombre, String descripcion, char nivel){
        this.nombre_paciente = nombre;
        this.descripcion_paciente = descripcion;
        this.nivel_paciente = nivel;
    }

    /**
     * Getter de descripcion_paciente
     * @return Retorna la descripcion
     */
    public String getDescripcion_paciente() { return descripcion_paciente; }

    /**
     * Getter de nivel_paciente
     * @return Retorna el nivel de prioridad
     */
    public char getNivel_paciente() { return nivel_paciente; }

    /**
     * Getter de nomnbre_paciente
     * @return Retorna el nombre del paciente
     */
    public String getNombre_paciente() { return nombre_paciente;}

    /**
     * Compara el nivel de prioridad con el paciente actual y otro.
     * @param paciente El otro paciente que esta comparando su nivel prioridad
     * @return -1 si es el paciente actual es mayor prioridad, 1 si es menor prioridad que el otro paciente.
     */

    @Override
    public int compareTo(Paciente paciente){
        //No se porque da error, investigando
        return (this.getNivel_paciente().compareTo(paciente.getNivel_paciente()));
    }
}
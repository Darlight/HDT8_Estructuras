public class Paciente implements Comparable<Paciente>{
    String nombre_paciente;
    String descripcion_paciente;
    char nivel_paciente;

    public Paciente(String nombre, String descripcion, char nivel){
        this.nombre_paciente = nombre;
        this.descripcion_paciente = descripcion;
        this.nivel_paciente = nivel;
    }

    public String getDescripcion_paciente() { return descripcion_paciente; }

    public char getNivel_paciente() { return nivel_paciente; }

    public String getNombre_paciente() { return nombre_paciente;}

    @override
    public int compareTo(Paciente paciente){
        return this.getNivel_paciente().compareTo(paciente.getNivel_paciente());
    }
}
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Sirve para leer el Archivo de un .txt
 */
public class Archivo{

    /**
     * @param direccion  la direccion del archivo
     * @return El texto en un String
     */
    //El parametro que recibe es
    //que se desea leer
    public String leerTexto(String direccion){

        String texto = "";

        //Se utiliza un try catch en caso de que la direccion
        //ingresada no sea correcta
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temporal = "";
            String bfRead;

            //Realiza el ciclo mientras bfRead tenga datos
            while((bfRead = bf.readLine()) != null){
                //Concatena el texto de nuestro archivo
                temporal += bfRead;
            }
            texto = temporal;

        }catch(Exception e){
            System.out.println("No se encontro el archivo");
        }

        return texto;
    }
}
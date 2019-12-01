package iteradorpersona;

import java.util.ArrayList;

/**
 *
 * @author edgar
 */
public interface Iterador {
    
    public Persona siguiente();
    public Persona anterior();
    public Persona actual();
    public boolean vacio();
    public int numElementos(String tipo);
    public ArrayList<Persona> buscarPorNombre(String nombre);
    
}

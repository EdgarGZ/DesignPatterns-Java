package iteradorpersona;

import java.util.ArrayList;

/**
 *
 * @author edgar
 */
public class Lista {
    
    private ArrayList<Persona> personas = new ArrayList();

    public Lista() {
    }
    
    public void addPersona(Persona persona){
        personas.add(persona);
    }
    
    public void verLista(){
        for(Persona persona : personas){
            System.out.println(persona);
        }
    }
    
    public IterPersona crearIterador(){
        return new IterPersona(this.personas);
    }
    
}

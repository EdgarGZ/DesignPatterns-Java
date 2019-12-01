package iteradorpersona;

import java.util.ArrayList;

/**
 *
 * @author edgar
 */

// ITERADOR CONCRETO
public class IterPersona implements Iterador {
    
    private int puntero = 0;
    protected ArrayList<Persona> listaPersonas;

    public IterPersona(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @Override
    public Persona siguiente() {
        if(!this.vacio() && this.listaPersonas.size() > (puntero + 1)){
            puntero++;
            return this.actual();
        } else {
            return null;
        }
    }

    @Override
    public Persona anterior() {
        if(!this.vacio() && puntero > 0){
            puntero--;
            return this.actual();
        } else {
            return null;
        }
    }

    @Override
    public Persona actual() {
        return (!this.vacio()) ? listaPersonas.get(puntero) : null;
    }

    @Override
    public boolean vacio() {
        return !(this.listaPersonas.size() > 0);
    }

    @Override
    public int numElementos(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Persona> buscarPorNombre(String nombre) {
        ArrayList<Persona> resultado = new ArrayList();
        for(Persona obj : this.listaPersonas){
            if(obj.getNombre() == nombre){
                resultado.add(obj);
            }
        }
        return resultado;
    }
    
    boolean esUltimo(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public IterAlumno getAlumnos() {
        ArrayList<Persona> resultado = new ArrayList();
        for(Persona obj : this.listaPersonas){
            if(obj instanceof Alumno){
                resultado.add((Alumno)obj);
            }
        }
        return new IterAlumno(resultado);
    }  

    @Override
    public String toString() {
        return listaPersonas.toString();
    }
    
    
    
}

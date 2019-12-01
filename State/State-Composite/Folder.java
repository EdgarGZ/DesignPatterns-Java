package compositeso;

import java.util.ArrayList;

/**
 *
 * @author edgar
 */
public class Folder extends Componente {
    
    private ArrayList<Componente> elementos = new ArrayList();

    public Folder(String nombre) {
        super(nombre);
    }
    
    public void addElemento(Componente elemento){
        elementos.add(elemento);
    }

    public void verElementos(){
        
        for(Componente elemento: elementos){
            System.out.println(elemento);
        }
        
    }
    
    @Override
    public float getSize(){
        float sumaSize = 0;
        
        for(Componente elemento: elementos){
            sumaSize += elemento.getSize();
        }
        
        return sumaSize;
    }

    @Override
    public void abrir() {
        System.out.println("Abrir la carpeta");
    }

    @Override
    public String toString() {
        return "(c)" + this.getNombre() + " " + this.elementos.size() + " elementos.";
    }
    
    @Override
    public void info(){
        
        System.out.println(this.getNombre() + " " + this.elementos.size() + " elementos");
        
        for(Componente elemento : elementos){
            elemento.info();
        }
        
    }

    @Override
    public void cambiarNombre(String nuevoNombre) {
        this.setNombre(nuevoNombre);
    }

    @Override
    public void cerrar() {
        System.out.println("Cerrar la carpeta");
    }
    
}

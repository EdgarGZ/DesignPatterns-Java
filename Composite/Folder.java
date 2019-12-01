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
    
    public void arbol(){
        for(Componente elemento : elementos){
            if(elemento instanceof Folder){
                System.out.println(elemento);
                ((Folder) elemento).verElementos();
            }else if(elemento instanceof Archivo){
                System.out.println(elemento);
            }
        }
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
    
}

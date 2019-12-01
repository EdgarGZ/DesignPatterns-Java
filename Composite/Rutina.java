package compositeso;

/**
 *
 * @author edgar
 */
public class Rutina extends Componente{

    public Rutina(String nombre, float size) {
        super(nombre, size);
    }

    @Override
    public void abrir() {
        System.out.println("Ejecutar rutina");
    }
    
    @Override
    public String toString() {
        return "(R)" + this.getNombre() + " (" + this.getSize() + ")";
    }

    @Override
    public void info() {
        System.out.println("(R)" + this.getNombre() + " (" + this.getSize() + ")");
    }
    
}

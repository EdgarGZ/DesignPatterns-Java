package compositeso;

/**
 *
 * @author edgar
 */
public abstract class Componente {
    
    private float size = 0;
    private String nombre;

    public Componente(String nombre) {
        this.nombre = nombre;
    }
    
    public Componente(String nombre, float size) {
        this.nombre = nombre;
        this.size = size;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void abrir();
    public abstract void cerrar();
    public abstract void cambiarNombre(String nombre);
    public abstract void info();
    
}

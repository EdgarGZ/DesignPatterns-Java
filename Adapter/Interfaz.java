package adaptadorpracticaethernet;

/**
 *
 * @author edgar
 */
public abstract class Interfaz {
    
    public String interfaz;

    public Interfaz(String interfaz) {
        this.interfaz = interfaz;
    }

    public String getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(String interfaz) {
        this.interfaz = interfaz;
    }
 
}

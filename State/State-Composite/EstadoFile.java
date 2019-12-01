package compositeso;

/**
 *
 * @author edgar
 */
public abstract class EstadoFile {
    
    protected Archivo contexto;

    public EstadoFile(Archivo contexto) {
        this.contexto = contexto;
    }

    public abstract void abrir();
    public abstract void cerrar();
    
}

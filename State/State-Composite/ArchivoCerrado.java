package compositeso;

/**
 *
 * @author edgar
 */
public class ArchivoCerrado extends EstadoFile {

    public ArchivoCerrado(Archivo contexto) {
        super(contexto);
    }

    @Override
    public void abrir() {
        this.contexto.setEstadoActual(this.contexto.getEstadoAbierto());
    }

    @Override
    public void cerrar() {
        System.out.println("El archivo se ha cerrado!");
    }
    
}

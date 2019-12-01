package compositeso;

/**
 *
 * @author edgar
 */
public class ArchivoAbierto extends EstadoFile {

    public ArchivoAbierto(Archivo contexto) {
        super(contexto);
    }

    @Override
    public void abrir() {
        System.out.println("Se abrio el archivo!");
    }

    @Override
    public void cerrar() {
        this.contexto.setEstadoActual(this.contexto.getEstadoCerrado());
    }
    
}

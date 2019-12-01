package compositeso;

/**
 *
 * @author edgar
 */
public abstract class Archivo extends Componente {
    
    private String extension;
    private EstadoFile estadoActual;
    private ArchivoCerrado estadoCerrado;
    private ArchivoAbierto estadoAbierto;
    
    public Archivo(String nombre, float size, String extension) {
        super(nombre, size);
        this.extension = extension;
        estadoCerrado = new ArchivoCerrado(this);
        estadoAbierto = new ArchivoAbierto(this);
        estadoActual = estadoCerrado;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public EstadoFile getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoFile estadoActual) {
        this.estadoActual = estadoActual;
    }

    public ArchivoCerrado getEstadoCerrado() {
        return estadoCerrado;
    }

    public void setEstadoCerrado(ArchivoCerrado estadoCerrado) {
        this.estadoCerrado = estadoCerrado;
    }

    public ArchivoAbierto getEstadoAbierto() {
        return estadoAbierto;
    }

    public void setEstadoAbierto(ArchivoAbierto estadoAbierto) {
        this.estadoAbierto = estadoAbierto;
    }
    
    @Override
    public void abrir() {
        // System.out.println("Abre el archivo en algun programa");
        estadoActual.abrir();
    }
    
    @Override
    public void cerrar() {
        estadoActual.cerrar();
    }
    
    @Override
    public void cambiarNombre(String nuevoNombre) {
        if(this.estadoActual == this.getEstadoCerrado()) {
            this.setNombre(nuevoNombre);
        } else {
            System.out.println("Primero cierra el archivo");
        }
    }

    @Override
    public String toString() {
        return "(a)" + this.getNombre() + this.getExtension() + "(" + this.getSize() + "MB)";
    }
    
    @Override
    public void info(){
        System.out.println(this.toString());
    }
    
    
   
}

package compositeso;

/**
 *
 * @author edgar
 */
public abstract class Archivo extends Componente {
    
    private String extension;
    
    public Archivo(String nombre, float size, String extension) {
        super(nombre, size);
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public void abrir() {
        System.out.println("Abre el archivo en algun programa");
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

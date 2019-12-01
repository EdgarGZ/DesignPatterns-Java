package iteradorpersona;

/**
 *
 * @author edgar
 */
public abstract class Persona {
    
    private String nombre, apellidos, sexo;

    public Persona(String nombre, String apellidos, String sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellidos + " (" + this.sexo + ").\n";
    }

}

package iteradorpersona;

/**
 *
 * @author edgar
 */
public class Profesor extends Persona {
    
    private static int secuencia = 1;
    private int clave = 1;
    private String area;

    public Profesor(String nombre, String apellidos, String sexo, String area) {
        super(nombre, apellidos, sexo);
        this.clave = secuencia;
        this.area = area;
        secuencia++;
    }

    public static int getSecuencia() {
        return secuencia;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + this.clave + ") " + "Profesor: " + this.area;
    }

}

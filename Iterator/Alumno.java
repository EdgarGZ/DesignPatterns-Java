package iteradorpersona;

import java.util.ArrayList;

/**
 *
 * @author edgar
 */
public class Alumno extends Persona {
    
    private static int secuencia = 1;
    private int expediente;
    private byte semestre;
    private String plan;

    public Alumno(String nombre, String apellidos, String sexo, byte semestre, String plan) {
        super(nombre, apellidos, sexo);
        this.expediente = secuencia;
        this.semestre = semestre;
        this.plan = plan;
        secuencia++;
    }

    public static int getSecuencia() {
        return secuencia;
    }

    public int getExpediente() {
        return expediente;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
 
    @Override
    public String toString() {
        return super.toString() + "(" + this.expediente + ") " + "Alumno: " + this.semestre + " semestre.";
    }    
    
}

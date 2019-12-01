/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteradorpersona;

import java.util.ArrayList;

/**
 *
 * @author edgar
 */
public class IterAlumno extends IterPersona {

    public IterAlumno(ArrayList<Persona> listaPersonas) {
        super(listaPersonas);
    }

    public IterAlumno bySemestre(int semestre){
        ArrayList<Persona> resultado = new ArrayList();
        for(Persona obj : this.listaPersonas){
            Alumno agregado = (Alumno)obj;
            if(agregado.getSemestre() == semestre){
                resultado.add(agregado);
            }
        }
        return new IterAlumno(resultado);
    }
    
    public IterAlumno byPlan(String plan){
        ArrayList<Persona> resultado = new ArrayList();
        for(Persona obj : this.listaPersonas){
            Alumno agregado = (Alumno)obj;
            if(agregado.getPlan() == plan){
                resultado.add(agregado);
            }
        }
        return new IterAlumno(resultado);
    }
    
}

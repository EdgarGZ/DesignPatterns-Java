package iteradorpersona;

/**
 *
 * @author edgar
 */
public class IteradorPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista grupoUno = new Lista();
        grupoUno.addPersona(new Profesor("Miguel",  "Nuñez", "M", "Ingles"));
        grupoUno.addPersona(new Alumno("Cesar", "Sanchez", "M", (byte)3, "SOF11"));
        grupoUno.addPersona(new Alumno("Miguel", "Perez", "M", (byte)3, "LATI"));

        //grupoUno.verLista();
        
        IterPersona recorrido = grupoUno.crearIterador();
        
        IterAlumno alumnos = recorrido.getAlumnos();
        
        System.out.println(alumnos.bySemestre(3).byPlan("SOF11"));
        //System.out.println(recorrido.actual());
        //System.out.println(recorrido.siguiente());
        
        //while(recorrido.esUltimo()){
            //System.out.println(recorrido.buscarPorNombre("Miguel"));
        //}
        
    }
    
}

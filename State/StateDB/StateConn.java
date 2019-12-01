package stateconn;

/**
 *
 * @author edgar
 */
public class StateConn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConnDB objeto = new ConnDB();
        
        objeto.ejecutarConsulta("Select");
        objeto.conectar("localhost", "root", "", "ejemplo");
        objeto.ejecutarConsulta("Select");
        objeto.desconectar();
    }
    
}

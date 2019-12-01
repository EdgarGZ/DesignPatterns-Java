package stateconn;

/**
 *
 * @author edgar
 */
public class ConnEjecutando extends EstadoConn {

    public ConnEjecutando(ConnDB contexto) {
        super(contexto);
    }

    @Override
    public void conectar(String ip, String user, String password, String dataBase) {
        System.out.println("La conexion se encuentra ocupada!.");
    }

    @Override
    protected boolean verificarDatos(String ip, String user, String password, String dataBase) {
        return true;
    }

    @Override
    public void ejecutarConsulta(String consulta) {
        System.out.println("La conexion se encuentra ocupada!.");
    }

    @Override
    public void desconectar() {
        System.out.println("La conexion se encuentra ocupada!.");
    }
    
}

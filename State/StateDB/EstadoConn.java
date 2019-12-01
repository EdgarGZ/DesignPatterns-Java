package stateconn;

/**
 *
 * @author edgar
 */
public abstract class EstadoConn {
    
    protected ConnDB contexto;

    public EstadoConn(ConnDB contexto) {
        this.contexto = contexto;
    }

    public abstract void conectar(String ip, String user, String password, String dataBase);
    protected abstract boolean verificarDatos(String ip, String user, String password, String dataBase);
    public abstract void ejecutarConsulta(String consulta);
    public abstract void desconectar();
    
}

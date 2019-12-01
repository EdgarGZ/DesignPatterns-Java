package stateconn;

/**
 *
 * @author edgar
 */
public class ConnDB {
    
    private String ip, user, pass, database;
    private EstadoConn estadoActual;
    private ConnConectado estadoConectado;
    private ConnDesconectado estadoDesconectado;
    private ConnEjecutando estadoEjecutando;
    
    public ConnDB() {
        estadoDesconectado = new ConnDesconectado(this);
        estadoConectado = new ConnConectado(this);
        estadoEjecutando = new ConnEjecutando(this);
        estadoActual = estadoDesconectado;
    }

    public void conectar(String ip, String user, String password, String dataBase) {
        estadoActual.conectar(ip, user, password, dataBase);
    }

    public void ejecutarConsulta(String consulta) {
        estadoActual.ejecutarConsulta(consulta);
    }

    public void desconectar() {
        estadoActual.desconectar();
    }

    public EstadoConn getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoConn estadoActual) {
        this.estadoActual = estadoActual;
    }

    public ConnConectado getEstadoConectado() {
        return estadoConectado;
    }

    public ConnDesconectado getEstadoDesconectado() {
        return estadoDesconectado;
    }

    public ConnEjecutando getEstadoEjecutando() {
        return estadoEjecutando;
    }
    
    
    
}

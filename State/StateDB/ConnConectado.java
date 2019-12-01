package stateconn;

/**
 *
 * @author edgar
 */
public class ConnConectado extends EstadoConn{

    public ConnConectado(ConnDB contexto) {
        super(contexto);
    }

    @Override
    public void conectar(String ip, String user, String password, String dataBase) {
        System.out.println("¡Ya existe una conexión!.");
    }

    @Override
    protected boolean verificarDatos(String ip, String user, String password, String dataBase) {
        return false;
    }

    @Override
    public void ejecutarConsulta(String consulta) {
        this.contexto.setEstadoActual(this.contexto.getEstadoEjecutando());
        System.out.println("Se ejecutará la consulta: " + consulta);
        this.contexto.setEstadoActual(this.contexto.getEstadoConectado());
    }

    @Override
    public void desconectar() {
        System.out.println("¡Vuelve pronto!.");
        this.contexto.setEstadoActual(this.contexto.getEstadoDesconectado());
    }
    
}

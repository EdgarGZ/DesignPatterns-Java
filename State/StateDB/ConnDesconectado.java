package stateconn;

/**
 *
 * @author edgar
 */
public class ConnDesconectado extends EstadoConn{

    public ConnDesconectado(ConnDB contexto) {
        super(contexto);
    }

    @Override
    public void conectar(String ip, String user, String password, String dataBase) {
        if(this.verificarDatos(ip, user, password, dataBase)){
            System.out.println("Conexion exitosa!");
            this.contexto.setEstadoActual(this.contexto.getEstadoConectado());
        } else {
            System.out.println("Verificar datos!");
        }
    }

    @Override
    protected boolean verificarDatos(String ip, String user, String password, String dataBase) {
        return ip.equals("localhost") && user.equals("root") && password.equals("") && dataBase.equals("ejemplo");
    }

    @Override
    public void ejecutarConsulta(String consulta) {
        System.out.println("Primero conecta a la Base de Datos!.");
    }

    @Override
    public void desconectar() {
        System.out.println("Está desconectado!.");
    }
    
}

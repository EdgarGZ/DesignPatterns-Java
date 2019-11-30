package cliente;

/**
 *
 * @author edgar
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AdminConexiones ejecutor = AdminConexiones.getAdminConexiones();
        Conexion.habilitarConexion("127.0.0.2");
        Conexion.habilitarConexion("localhost");
        
        //Conexion.mostrarConexiones();
        
        ejecutor.addConsulta("Select * from clientes");
        ejecutor.addConsulta("Select * from productos");
        ejecutor.addConsulta("Select * from empleados");
        ejecutor.addConsulta("Select * from pedidos");
        
        ejecutor.consultar();
        
    }
    
}

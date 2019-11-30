package cliente;

import java.util.ArrayList;

/**
 *
 * @author edgar
 */
public class AdminConexiones {
    
    private ArrayList<String> bufferConsultas = new ArrayList();
    private static AdminConexiones conn = null;

    public AdminConexiones() {
        Conexion.crearConexion("root", "localhost", "", "hr");
        Conexion.crearConexion("admin", "127.0.0.2", "123", "hr");
    }
    
    public static AdminConexiones getAdminConexiones(){
        if(conn == null){
            AdminConexiones.conn = new AdminConexiones();
        }
        return AdminConexiones.conn;
    }
    
    public void addConsulta(String query){
        this.bufferConsultas.add(query);
    }
    
    public void consultar(){
        
        for(String query : this.bufferConsultas){
            boolean buscarConexion = true;
            while(buscarConexion){
                buscarConexion = !Conexion.consultar(query);
            }
        }
        
        System.out.println("No hay mas consultas");
        
    }
    
}

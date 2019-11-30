package cliente;

import java.util.ArrayList;

/**
 *
 * @author edgar
 */
public class Conexion {
    
    private static ArrayList<Conexion> conexiones = new ArrayList();
    private boolean disponible = false;
    private boolean consultando = false;
    private String user, ip, pass, bd;

    public Conexion(String user, String ip, String pass, String bd) {
        this.user = user;
        this.ip = ip;
        this.pass = pass;
        this.bd = bd;
    } 
    
    public static void crearConexion(String ip, String user, String pass, String bd){
        if(conexiones.size()<2){
            synchronized (Conexion.class){
                conexiones.add(new Conexion(ip, user, pass, bd));
            }
        } else {
            System.out.println("Ya no se pueden crear más conexiones.");
        }
    }
        
    public static boolean consultar(String query){       
        for(Conexion obj : conexiones){
            if(obj.isDisponible()){
                if(!obj.isConsultando()){
                    System.out.println(obj.getIp()+" ejecuta: "+query);
                    obj.setConsultando(true);
                    Hilo ejecucion = new Hilo(obj);
                    ejecucion.start();                  
                    return true;
                } 
            }
        }
        return false;
    }
    
     public static void deshabilitarConexion(String ip){
        for(Conexion obj : conexiones){
            if(obj.getIp().equals(ip)){
                obj.setDisponible(false);
            }
        }
    }
    
    public static void habilitarConexion(String ip){
        for(Conexion obj : conexiones){
            if(obj.getIp().equals(ip)){
                obj.setDisponible(true);
                break;
            }
        }
    }
    
    public static void mostrarConexiones(){
        for(Conexion obj : conexiones){
                System.out.println(obj);
            }
    }
    
    public boolean isDisponible() {
        return disponible;
    }
    
    public boolean isConsultando() {
        return consultando;
    }
    public void setConsultando(boolean consultando) {
        this.consultando = consultando;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    @Override
    public String toString() {
        return "Conexion{" + "disponible=" + disponible + ", consultando=" + consultando + ", user=" + user + ", ip=" + ip + ", pass=" + pass + ", bd=" + bd + '}';
    }

}

package cliente;

/**
 *
 * @author edgar
 */
public class Hilo extends Thread {
    
    private Conexion conn;

    public Hilo(Conexion conn) {
        this.conn = conn;
    }
    
    @Override
    public void run(){
        if(conn.isConsultando()){
            try{
                int segundos = tiempoDormir();
                conn.setConsultando(false);
                Thread.sleep(segundos);
                System.out.println(conn.getIp() + " regreso resultado: " + (segundos/1000) + " segundos");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public int tiempoDormir(){  
        int tiempoSegundos = (int)(Math.random()*5000);
        return tiempoSegundos;
    }
    
    
    public Conexion getConn() {
        return conn;
    }

    public void setConn(Conexion conn) {
        this.conn = conn;
    }
}

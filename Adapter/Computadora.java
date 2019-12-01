package adaptadorpracticaethernet;

/**
 *
 * @author edgar
 */
public class Computadora {
        
    public void enviarArchivo(String archivo, Ethernet e){
        if(e.getInterfaz() == "Ethernet"){
            System.out.println("Se mando el archivo '" + archivo + "'.");
        } else {
            System.err.println("Imposible mandar el archivo!.");
        }
    }
    
    public void enviarArchivo(String archivo, Coaxial c){
        if(c.getInterfaz() == "Ethernet"){
            System.out.println("Se mando el archivo '" + archivo + "'.");
        } else {
            System.err.println("Imposible mandar el archivo!.");
        }
    }
    
    public void enviarArchivo(String archivo, WiFi w){
        if(w.getInterfaz() == "Ethernet"){
            System.out.println("Se mando el archivo '" + archivo + "'.");
        } else {
            System.err.println("Imposible mandar el archivo!.");
        }
    }
    
}

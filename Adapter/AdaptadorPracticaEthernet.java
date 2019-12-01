package adaptadorpracticaethernet;

/**
 *
 * @author edgar
 */
public class AdaptadorPracticaEthernet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Computadora compUno = new Computadora();
        Ethernet cableEth = new Ethernet();
        Coaxial cableCo = new Coaxial();
        
        compUno.enviarArchivo("arbol.jpg", cableCo);
        
        Adaptador a = new Adaptador(cableCo);
        
        compUno.enviarArchivo("arbol.jpg", a.adaptarCoaxial(cableCo));
        
    }
    
}

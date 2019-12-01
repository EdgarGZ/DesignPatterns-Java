package facadearcade;

/**
 *
 * @author edgar
 */
public class FacadeArcade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FachadaArcade arcade = new FachadaArcade();
        
        arcade.comprarTarjeta();
        
        arcade.jugarMaquinitas();
        
        arcade.consultarSaldo();
        
        arcade.comprarPremio(2);
        
        
    }
    
}

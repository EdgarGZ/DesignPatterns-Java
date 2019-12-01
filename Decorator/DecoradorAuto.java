package decoradorauto;

/**
 *
 * @author edgar
 */
public class DecoradorAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Auto mazda3 = new Mazda3();
        
        mazda3.ensamblar(2017, 320000, "Premium", "Automatico");
        
        mazda3 = new RinesDeportivos(mazda3);   
        
        System.out.println(mazda3.getCosto());
    }
    
}

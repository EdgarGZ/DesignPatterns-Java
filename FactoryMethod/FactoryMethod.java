package factorymethod;

/**
 *
 * @author edgar
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CreadorConcreto c = new CreadorConcreto();
        Celular celNuevo = c.crearCelular("S8");
        celNuevo.encender();
        celNuevo.llamar();
        celNuevo.apagar();
        
    }
    
}

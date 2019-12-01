package factorymethod;

/**
 *
 * @author edgar
 */
public class CreadorConcreto extends Creador {
    
    private Celular celular = null;
    
    @Override
    public Celular crearCelular(String modelo) {
        switch(modelo){
            case "S8":
                celular = new S8();
            break;
            case "Note":
                celular = new Note();
            break;
            default:
                System.out.println("Error");
        }
        return celular;
    }
    
}

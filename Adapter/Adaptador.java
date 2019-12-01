package adaptadorpracticaethernet;

/**
 *
 * @author edgar
 */
public class Adaptador {
    
    private Coaxial c;
    private WiFi w;

    public Adaptador(Coaxial c) {
        this.c = c;
    }

    public Adaptador(WiFi w) {
        this.w = w;
    }
    
    public Coaxial adaptarCoaxial(Coaxial c){
        if(c.getInterfaz() != "Ethernet"){
            c.setInterfaz("Ethernet");
            return c;
        } else {
            return c;
        }
    }
    
    public WiFi adaptarWifi(WiFi w){
        if(w.getInterfaz() != "Ethernet"){
            w.setInterfaz("Ethernet");
            return w;
        } else {
            return w;
        }
    }
    
}

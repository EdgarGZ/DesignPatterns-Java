package facadearcade;

/**
 *
 * @author edgar
 */
public class FachadaArcade {
    
    // Fachada
    
    private Tarjeta tarjeta;
    private Maquinita maquinita;
    private Cajero cajero;
    
    public FachadaArcade() {
        this.tarjeta = new Tarjeta();
        this.maquinita = new Maquinita();
        this.cajero = new Cajero();
    }
    
    public void comprarTarjeta(){
        System.out.println(cajero.nuevaTarjeta());
    }
    
    public void jugarMaquinitas(){
        tarjeta.aumentarSaldo(10);
        System.out.println(maquinita.jugar());
    }
    
    public void consultarSaldo(){
        System.out.println(Integer.toString(tarjeta.saldo()));
    }
    
    public void comprarPremio(int costo){
        if(costo <= tarjeta.saldo()){
            tarjeta.cobrar(costo);
            cajero.darPremio();
            System.out.println("Saldo posterior: " + Integer.toString(tarjeta.saldo()));
        } else{
            System.out.println("No te alcanza, man");
        }
    }
    
}

package facadearcade;

/**
 *
 * @author edgar
 */
public class Tarjeta {
    
    private int saldo = 100;
    
    public void cobrar(int cantidad){
        
        this.saldo = saldo - cantidad;
        
    }
    
    public int saldo(){
        
        return this.saldo;
        
    }
    
    public void aumentarSaldo(int aumento){
        
        this.saldo = saldo + aumento;
        
    }
    
}

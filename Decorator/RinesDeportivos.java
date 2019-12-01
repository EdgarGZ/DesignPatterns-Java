/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoradorauto;

/**
 *
 * @author edgar
 */
public class RinesDeportivos extends Decorador {

    public RinesDeportivos(Auto referencia) {
        super(referencia);
    }
    
    @Override
    public void ensamblar(int anio, double precio, String tipoGasolina, String transmision) {
       this.getReferencia().ensamblar(anio, precio, tipoGasolina, transmision);
       this.addRinesDeportivos();
    }    
    
     public void addRinesDeportivos() {
        System.out.println("Se añadieron rines deportivos");
    }
    
    @Override
    public double getCosto() {
        return this.getReferencia().getCosto() + 10000.00;
    }
    
}

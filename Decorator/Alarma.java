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
public class Alarma extends Decorador {
    
    public Alarma(Auto referencia) {
        super(referencia);
    }

    @Override
    public void ensamblar(int anio, double precio, String tipoGasolina, String transmision) {
       this.getReferencia().ensamblar(anio, precio, tipoGasolina, transmision);
       this.addAlarma();
    }    
    
     public void addAlarma() {
        System.out.println("Se añadio alarma");
    }
    
    @Override
    public double getCosto() {
        return this.getReferencia().getCosto() + 1500.00;
    }
    
}

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
public class SistemaAudio extends Decorador{
    
    public SistemaAudio(Auto referencia) {
        super(referencia);
    }

    @Override
    public void ensamblar(int anio, double precio, String tipoGasolina, String transmision) {
       this.getReferencia().ensamblar(anio, precio, tipoGasolina, transmision);
       this.addSistemaAudio();
    }    
    
     public void addSistemaAudio() {
        System.out.println("Se añadio sistema de audio prron");
    }
    
    @Override
    public double getCosto() {
        return this.getReferencia().getCosto() + 5000.00;
    }
    
}

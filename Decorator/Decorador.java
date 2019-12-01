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
public abstract class Decorador implements Auto {
    
    protected Auto referencia;
    
    public Decorador(Auto referencia) {
        this.setReferencia(referencia);
    }

    private void setReferencia(Auto referencia) {
        this.referencia = referencia;
    }
    
    public Auto getReferencia(){
        return this.referencia;
    }

    @Override
    public void ensamblar(int anio, double precio, String tipoGasolina, String transmision) {
       this.getReferencia().ensamblar(anio, precio, tipoGasolina, transmision);
    }    
    
}

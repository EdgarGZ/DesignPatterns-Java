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
public class Civic implements Auto {
    
    private String transmision;
    private double precio;

    @Override
    public void ensamblar(int anio, double precio, String tipoGasolina, String transmision) {
        System.out.println("Se esta cotizando un Civic:\n Año: " + anio + "\n Precio: " + precio + "\n Tipo de gasolina: " + tipoGasolina + "\n Transmision: " + transmision);
        this.transmision = transmision;
        this.precio = precio;
    }

    @Override
    public double getCosto() {
        double aumento = 15000.00;
        
        if(this.transmision.equals("Automatico") || this.transmision.equals("automatico")){
            return this.precio + aumento;
        } else {
            return this.precio;
        }     
    }
    
}

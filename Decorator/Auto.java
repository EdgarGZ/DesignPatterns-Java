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
public interface Auto {
    
    // Componente
    
    public int anio = 0;
    public double precio = 0;
    public String tipoGasolina = "";
    public String transmision = "";
    
    public void ensamblar(int anio, double precio, String tipoGasolina, String transmision);
    
    public double getCosto();
   
}

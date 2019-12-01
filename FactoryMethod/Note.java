/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author edgar
 */
public class Note implements Celular{
    
    @Override
    public void encender() {
        System.out.println("El celular se esta encendiendo");
    }

    @Override
    public void apagar() {
        System.out.println("El celular se esta apagando");
    }

    @Override
    public void llamar() {
        System.out.println("El celular esta llamando");
    }
    
}

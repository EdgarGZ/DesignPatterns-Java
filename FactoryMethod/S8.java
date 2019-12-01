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
public class S8 implements Celular{

    @Override
    public void encender() {
        System.out.println("El S8 se esta encendiendo");
    }

    @Override
    public void apagar() {
        System.out.println("El S8 se esta apagando");
    }

    @Override
    public void llamar() {
        System.out.println("El S8 esta llamando");
    }
    
}

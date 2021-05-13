/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

/**
 *
 * @author Antony Artavia
 */
public class TransportePesado extends Transporte {

    public TransportePesado() {}

    @Override
    public void transportar() {
        String msg = "Soy un vehiculo pesado que puede llevar "+this.getNumPersonas()+" personas";
        msg += " y tiene "+this.getCantidadCombustible()+" litros de combustible en el tanque";
        System.out.println(msg);
    }
}

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
public class FactoryTransporte {
    private static FactoryTransporte factoryTransporte;
    
    private FactoryTransporte(){}
    
    public static FactoryTransporte getInstance() {
        if(factoryTransporte == null){
            factoryTransporte = new FactoryTransporte();
        }
        
        return factoryTransporte;
    }
    
    public Transporte createTransporte(String tipoTransporte) {
        if(tipoTransporte == null) {
            return null;
        } else if (tipoTransporte.equalsIgnoreCase("BUS")) {
            return new Bus();
        } else if (tipoTransporte.equalsIgnoreCase("AUTOMOVIL")) {
            return new Automovil();
        } else if (tipoTransporte.equalsIgnoreCase("PESADO")) {
            return new TransportePesado();
        }
        
        return null;
    }
}

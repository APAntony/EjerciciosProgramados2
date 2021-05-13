package Soda;

import java.util.ArrayList;

/**
 *
 * @author Antony Artavia
 */
public class PoolOrdenes {
    private ArrayList<Orden> ordenes;
    private static PoolOrdenes poolOrdenes;
    
    private PoolOrdenes(){
        ordenes = new ArrayList<Orden>();
    }
    
    public static PoolOrdenes getInstance(){
        if (poolOrdenes == null) {
            poolOrdenes = new PoolOrdenes();
        }
        
        return poolOrdenes;
    }
    
    public Orden adquirirOrden(){
        return ordenes.remove(0);
    }
    
    public  void agregarOrden(Orden orden) {
        this.ordenes.add(orden);
    }
}

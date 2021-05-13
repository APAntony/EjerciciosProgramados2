package Soda;

/**
 *
 * @author Antony Artavia
 */
public class Repartidor {
    private Orden orden;

    public Repartidor(Orden orden) {
        this.orden = orden;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }
    
    public void entregar() {
        System.out.println("Voy a entregar la orden: " + orden.getIdentificador());
    }
    
    public void obtenerOrden() {
        this.orden = PoolOrdenes.getInstance().adquirirOrden();
    }
}

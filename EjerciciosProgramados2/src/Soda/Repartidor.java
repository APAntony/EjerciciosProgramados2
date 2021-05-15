package Soda;

/**
 *
 * @author Antony Artavia
 */
public class Repartidor {
    private Orden orden;
    private String nombre;

    public Repartidor(String nombre) {
        this.nombre = nombre;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }
    
    public void entregar() {
        System.out.println("Soy "+this.nombre+" y voy a entregar la orden: " + orden.getIdentificador());
    }
    
    public void obtenerOrden() {
        this.orden = PoolOrdenes.getInstance().adquirirOrden();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

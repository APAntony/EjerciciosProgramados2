package transporte;

/**
 *
 * @author Antony Artavia
 */
public abstract class Transporte {
    protected int numPersonas;
    protected float cantidadCombustible;
    
    public abstract void transportar();

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public float getCantidadCombustible() {
        return cantidadCombustible;
    }

    public void setCantidadCombustible(float cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }
}

package soda;

import java.util.ArrayList;

/**
 *
 * @author Antony Artavia
 */
public class Orden {
    private ArrayList<Producto> productos;
    private int identificador;

    public Orden(int identificador) {
        this.productos = new ArrayList<Producto>();
        this.identificador = identificador;
    }
    
    public void addProducto(Producto producto) {
        productos.add(producto);
    }
    
    public double getPrecioTotal() {
        double total = 0;
        for (Producto producto: productos) {
            total += producto.getPrecio();
        }
        
        return total;
    }

    @Override
    public String toString() {
        String mensaje = "";
        mensaje += "Orden: " +this.identificador+ "\n";
        mensaje += "Precio: " +this.getPrecioTotal()+"\n";
        mensaje += "Productos: \n";
        
        for (Producto producto: productos) {
            mensaje += producto.toString() + "\n";
        }
        
        return mensaje;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    
}

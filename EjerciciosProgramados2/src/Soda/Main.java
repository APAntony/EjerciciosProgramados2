/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soda;

/**
 *
 * @author Antony Artavia
 */
public class Main {
    
    public static void main(String[] args) {
        PoolOrdenes pool = PoolOrdenes.getInstance();
        
        //Creacion de dos repartidores
        Repartidor repartidor1 = new Repartidor("Antony");
        Repartidor repartidor2 = new Repartidor("Zhong");
        
        //Creacion de productos
        Producto dona = new Producto("Dona", 1550, "Donas cubiertas con chocolate");
        Producto hamburquesaP = new Producto("Hamburguesa", 1700, "Amburguesa con torta de pescado");
        Producto papasFritas = new Producto("Papas fritas", 1000, "30 papas fritas con salsa");
        Producto polloFrito = new Producto("Pollo frito", 2200, "Pollo frito clasico");
        Producto alitasFriats = new Producto("Alitas de pollo", 1500, "Alitas de pollo frito");
        Producto cocaCola = new Producto("Coca Cola", 750, "Bebida gaseosa");
        Producto pepsi = new Producto("Pepsi", 650, "Bebida gaseosa");
        
        
        //Creacion de tres ordenes
        System.out.println("Creacion de 3 ordenes");
        Orden orden1 = new Orden(12345);
        orden1.addProducto(hamburquesaP);
        orden1.addProducto(papasFritas);
        orden1.addProducto(pepsi);
        System.out.println(orden1.toString());
        
        Orden orden2 = new Orden(54321);
        orden2.addProducto(polloFrito);
        orden2.addProducto(alitasFriats);
        orden2.addProducto(cocaCola);
        System.out.println(orden2.toString());
        
        Orden orden3 = new Orden(56789);
        orden3.addProducto(dona);
        orden3.addProducto(pepsi);
        System.out.println(orden3.toString());
        
        
        //Se agregan las ordenes al Pool
        pool.agregarOrden(orden1);
        pool.agregarOrden(orden2);
        pool.agregarOrden(orden3);
        
        //Despliuegue del pool actual
        System.out.println("---------------------------------------------------");
        System.out.println("Estado actual del pool");
        System.out.println(pool.toString());
        
        //Los repartidores consiguen una orden
        System.out.println("Dos repartidores consiguen ordenes");
        repartidor1.obtenerOrden();
        repartidor2.obtenerOrden();
        repartidor1.entregar();
        repartidor2.entregar();
        
        System.out.println();
        
        //Despliuegue del pool actual
        System.out.println("Estado actual del pool");
        System.out.println(pool.toString());
    }
}

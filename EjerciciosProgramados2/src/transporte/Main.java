package transporte;

/**
 *
 * @author liugu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FactoryTransporte factory = FactoryTransporte.getInstance();
       
       //Frabricacion de instancias
       System.out.println("Se crea una instancia de cada tipo de transporte.\n");
       Transporte miBus = factory.createTransporte("bus");
       Transporte miAuto = factory.createTransporte("automovil");
       Transporte miTransPesado = factory.createTransporte("pesado");
       
       //Configuracion del bus
       miBus.setNumPersonas(52);
       miBus.setCantidadCombustible(10);
       
       //Configuracion del automovil
       miAuto.setNumPersonas(4);
       miAuto.setCantidadCombustible(13);
       
       //Configuracion del automovil
       miTransPesado.setNumPersonas(2);
       miTransPesado.setCantidadCombustible(15);
       
       System.out.println("Informacion de los transportes");
       System.out.println("Bus:");
       miBus.transportar();
       
       System.out.println("Automovil:");
       miAuto.transportar();
       
       System.out.println("Transporte pesado:");
       miTransPesado.transportar();
    }
    
}

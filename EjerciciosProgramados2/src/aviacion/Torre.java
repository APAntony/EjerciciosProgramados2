/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aviacion;

/**
 *
 * @author liugu
 */
public class Torre {
    private Aeronave[] aeronaves;
    
    public Torre(){
        this.aeronaves = new Aeronave[4];
    }
    
    public void addAeronave(Aeronave aeronave){
        for (int i=0;i<aeronaves.length;i++){
            if (aeronaves[i] == null){
                aeronaves[i] = aeronave;
                break;
            }
        }
    }
    /**
     * 0: En tierra
     * 1: Despegando
     * 2: En vuelo
     * 3: Aterrizando
     * 
     */
    public String preguntarDespegue(Aeronave aeronave){
        for (int i=0;i<aeronaves.length;i++){
            if(aeronaves[i]!= null &  ! aeronaves[i].equals(aeronave)){
                if (aeronaves[i].getPosicion() == 1 | aeronaves[i].getPosicion() == 3) {
                    return "NO";
                }
            }
        }
        return "SI";
    }
    
    
    public void indicarEstado(Aeronave aeronave){
        System.out.println("Posición recibida de "+ aeronave.getCodigo() +   ": " + aeronave.getPosicion());
        
    };
    
    public void notificar(Aeronave aeronave,String mensaje){
        for (int i=0;i<aeronaves.length;i++){
            if (aeronaves[i]!= null & !aeronaves[i].equals(aeronave)){
                aeronaves[i].update("Aeronave " + aeronave.getCodigo() + " " +  mensaje);
            }
        }
    }
    /**
    public void showAviones(){
        for (int i=0;i<aeronaves.length;i++){
            System.out.println(aeronaves[i].toString());
        }
    }*/
}

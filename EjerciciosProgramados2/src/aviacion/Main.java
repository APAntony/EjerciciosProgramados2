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
public class Main {
    public static void main(String[]args){
        Torre torre = new Torre();
        
        Aeronave avion1 = new Aeronave(torre,0,"TEC-01");
        Aeronave avion2 = new Aeronave(torre,0,"TEC-02");
        Aeronave avion3 = new Aeronave(torre,0,"TEC-03");
        Aeronave avion4 = new Aeronave(torre,0,"TEC-04");
        
        torre.addAeronave(avion1);
        torre.addAeronave(avion2);
        torre.addAeronave(avion3);
        torre.addAeronave(avion4);
        
        avion1.preguntarDespegue();
        avion2.preguntarDespegue();
        
        avion1.despegar();
        
        avion2.preguntarDespegue();
        avion2.despegar();
        
        // tratar de aterrizar sin permiso de torre
        avion1.aterrizar();
        
        avion1.preguntarAterrizaje();
        avion1.aterrizar();
        
    }
}

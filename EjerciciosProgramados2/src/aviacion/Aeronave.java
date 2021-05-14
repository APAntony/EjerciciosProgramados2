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
public class Aeronave {
    private Torre mediador;
    private int posicion;
    private String codigo;

    public Aeronave(Torre torre,int posicion,String codigo){
        this.mediador = torre;
        this.posicion = posicion;
        this.codigo = codigo;
    }
    
    public Torre getMediador() {
        return mediador;
    }

    public void setMediador(Torre mediador) {
        this.mediador = mediador;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    /**
     * 0: En tierra
     * 1: Despegando
     * 2: En vuelo
     * 3: Aterrizando
     */
    public void preguntarDespegue(){
        String respuesta = this.mediador.preguntarDespegue(this);
        System.out.println(respuesta);
        if (respuesta=="SI"){
            this.setPosicion(1);
            this.indicarEstado("Preparando para el despegue");
        }
    }
    
    public void preguntarAterrizaje(){
        String respuesta = this.mediador.preguntarDespegue(this);
        System.out.println(respuesta);
        if (respuesta=="SI"){
            this.setPosicion(3);
            this.indicarEstado("Preparando para el aterrizaje");
        }
    }
    
    public void indicarEstado(String operacion){
        //this.mediador.indicarEstado(this);
        this.mediador.notificar(this, operacion);
    }
    
    public void update(String mensaje){
        System.out.println(this.codigo + ". " + "Mensaje de torre: " + mensaje);
    }
    /**
     * 0: En tierra
     * 1: Despegando
     * 2: En vuelo
     * 3: Aterrizando
     * 
     */
    public void despegar(){
        if(this.posicion == 1){
            this.setPosicion(2);
            this.indicarEstado("Volando");
        } else{
            System.out.println("No estoy preparado para el despegue");
        }
    }
    
    public void aterrizar(){
        if(this.posicion == 3){
            this.setPosicion(0);
            this.indicarEstado("Aterrizaje completado");
        } else{
            System.out.println("No estoy preparado para el aterizaje");
        }
        
        
    }

    @Override
    public String toString() {
        return "Aeronave{" + "posicion=" + posicion + ", codigo=" + codigo + '}';
    }
 
    
}

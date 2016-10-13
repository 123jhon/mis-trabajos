/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author Ismael
 */
public class Equipo implements Comparable<Equipo>{
    
    private int numEquipo;
    private String nombreEquipo;
    private String nombreDT;

    public Equipo() {
    }

    public Equipo(int numEquipo, String nombreEquipo, String nombreDT) {
        this.numEquipo = numEquipo;
        this.nombreEquipo = nombreEquipo;
        this.nombreDT = nombreDT;
    }

    public int getNumEquipo() {
        return numEquipo;
    }

    public void setNumEquipo(int numEquipo) {
        this.numEquipo = numEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreDT() {
        return nombreDT;
    }

    public void setNombreDT(String nombreDT) {
        this.nombreDT = nombreDT;
    }

    @Override
    public String toString() {
        String rta = "Equipo:\n";
        rta += this.numEquipo + ") Nombre: " + this.nombreEquipo + " - " + this.nombreDT;
        return rta;
    }

    @Override
    public int compareTo(Equipo e2) {
        if(e2 != null){
            
            if(this.nombreEquipo.compareTo(e2.getNombreEquipo()) > 0){
                return 1;
            }else if(this.nombreEquipo.compareTo(e2.getNombreEquipo()) < 0){
                return -1;
            } else{
                if(this.numEquipo > e2.getNumEquipo()){
                    return 1;
                } else if(this.numEquipo < e2.getNumEquipo()){
                    return -1;
                } else{
                    return 0;
                }
            }
        } else{
            System.out.println("Error al comparar los equipos, objeto no definido.");
            return -2;
        }
    }
    
    
}

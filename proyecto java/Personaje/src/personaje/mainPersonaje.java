/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaje;

/**
 *
 * @author jhone
 */
public class mainPersonaje {
public static void main(String[] args){
    Personaje cualquiera = new Personaje();
    System.out.println("por defecto tenemos un personaje: "+"un nombre "+cualquiera.nombre+" y una vida de: "+cualquiera.vida);
    cualquiera.vida = -40;
    System.out.println("la vida de: "+cualquiera.nombre+" es "+cualquiera.vida);
}    

}

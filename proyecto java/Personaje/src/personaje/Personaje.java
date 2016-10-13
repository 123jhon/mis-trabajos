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
public class Personaje {
/*
 *  public x -> se podra consultar y modificar en cualquier lugar, es decir, desde la
 *    clase, desde el paquete, o desde otro paquete. 
 *  por defcto x (default) -> es decir, sin nada, permite que x se modifique o se consulte
 *    desde cuaquier clase DENTRO DEL MISMO "paquete".   
 *  protected x -> permite que x sea modificado desde la clase  del mismo paquete y desde
 *    otras clases que hereden aunque esten en otro paquete.
 *  private x -> permite que x sea consultado  o modificado desde la clase UNICAMENTE.
 *   
 */
    
  int vida;
  String nombre;
  String color;
  String imagen;
  int posx;
  int posy;
  
  public Personaje(){
  this.vida = 100;
  this.nombre = "player";
  imagen ="/home/usario/imagen.jpng";
  posx = (int)(Math.random()*99);
  posy = (int)(Math.random()*99);
  
   
  }
  public Personaje(String nombre){
  this.nombre =nombre;
  }  
    
}

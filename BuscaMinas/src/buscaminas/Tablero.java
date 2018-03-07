/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;


public class Tablero {
    
  private  Celda miCelda [][];
   private Cronometro miCronometro;
   private Contador miConta;
   private Emoji miEmoji;
   
    
public Tablero (int ancho, int largo){
    
    
    miCelda=new Celda [ancho][largo];
       int fila;
       int columna;
       for (fila=0; fila<largo;fila++){
           for (columna=0; columna<ancho; columna++){
           miCelda[fila][columna]=new Celda ();
       } 
    }  
    
    
    Sembrador miTrabajador ;
    miTrabajador = new Sembrador ();
    miTrabajador.sembrarCorazon(miCelda, 50);
    
   }    
  
  

}

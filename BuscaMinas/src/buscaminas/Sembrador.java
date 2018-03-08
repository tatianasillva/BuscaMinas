/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.util.Random;


public class Sembrador {
    
    
    void sembrarCorazon (Celda lasCeldas [][], int cantidad){
    
        
     Random aleatorio;
     
     aleatorio= new Random ();
     
     int corazonAleatorio;
     int sumatoria=0;
     
        
        
    for (Celda [] laFila:lasCeldas){
        
        
        for(Celda laCelda:laFila){
            
            corazonAleatorio=aleatorio.nextInt(10);
            if (corazonAleatorio >5 && sumatoria<cantidad){
                
            
            
              Corazon unCorazon= new Corazon ();
              
             laCelda.setMiCorazon(unCorazon);
             sumatoria++;
        }
        }
    }
   
    }
    
 if (lasceldas[fila][columna].getMiCorazon()== null) {
     
    lasceldas[fila][columna].setMiCorazon(new Corazon());
    contador++;
    
    
 }  

void corazonAlrededor (Celda lasceldas[][]){ 
 
 int fila=0, columna;
 
 
 
 for (Celda laFila[]: lasceldas){
     columna=0;
     fila++;
     for (Celda miCelda: laFila){
         columna++;
         
        miCelda.setCorazonesAlrededor(sumarcorazon(lasceldas, fila, columna));
        
        
     }
 }
}
 
 int sumarcorazon(Celda matriz [][], int fila, int columna){
     int total = 0, x, y;
     boolean casillavalida;
     int totalFilas = matriz. length;
     int totalColumnas = matriz[0]. length;
     
     for(x=-1; x<2; x++){
      for(y=-1; y<2; y++){
          
          
        casillavalida = validarCasilla (fila, columna, x, y, totalFilas, totalColumnas);
        
        if (casillavalida && (matriz [fila + x][columna + y].getMiCorazon()! = null)){
         total++;
         
          
      }
      }
 }
    
   return total;
     
 }
     
   boolean validarCasilla (int fila, int columna, int x, int y, int totalFilas, int totalColumnas ){
     
    boolean filavalida, columnavalida;
    
     if (x < 0) {
       filavalida = ((fila+x) > -1);
       
       
     } else {
        filavalida = (fila + x < totalFilas);
            
     }
      if (y < 0){
         columnavalida = (columna + y > -1); 
          
      } else {  
          
         columnavalida = (columna + y < totalColumnas);
         
      }   
       
     return filavalida && columnavalida;
     
    
    
  
        

    

} 
    
    


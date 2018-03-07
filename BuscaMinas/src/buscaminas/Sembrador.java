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
   
      
 
}
      
  
        

    

    
    
    


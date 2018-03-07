/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;


public class Sembrador {
    
    
    void sembrarCorazon (Celda lasCeldas [][], int cantidad){
    
    for (Celda [] laFila:lasCeldas){
        
        for(Celda laCelda:laFila){
            Corazon unCorazon=new Corazon ();
            laCelda.setMiCorazon(unCorazon);
        }
    }
    
    
}    
}

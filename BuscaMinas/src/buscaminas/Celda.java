/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;


public class Celda {
    
     
    private boolean estado;
    private Corazon miCorazon;
    private Bandera miBandera;
    private int corazonesAlrededor;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Corazon getMiCorazon() {
        return miCorazon;
    }

    public void setMiCorazon(Corazon miCorazon) {
        this.miCorazon = miCorazon;
    }

    public Bandera getMiBandera() {
        return miBandera;
    }

    public void setMiBandera(Bandera miBandera) {
        this.miBandera = miBandera;
    }

    public int getCorazonesAlrededor() {
        return corazonesAlrededor;
    }

    public void setCorazonesAlrededor(int corazonesAlrededor) {
        this.corazonesAlrededor = corazonesAlrededor;
    }
    
    
    
}

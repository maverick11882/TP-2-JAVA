/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Facu
 */
public class Stock {
    private int codigoInterno;
    private short cantidad;

    public Stock() {
    }

    public Stock(int codigoInterno, short cantidad) {
        this.codigoInterno = codigoInterno;
        this.cantidad = cantidad;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public short getCantidad() {
        return cantidad;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}

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
public class Rol {
    private int codigo;
    private String descripcion;
    private float comision;

    public Rol() {
    }

    public Rol(int codigo, String descripcion, float comision) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.comision = comision;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getComision() {
        return comision;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }
    
    
    
}

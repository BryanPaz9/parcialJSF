/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialjsf;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author 001la
 */
public class Cliente {
    @NotNull
    @Min(value=1000000, message="El codigo tiene que ser mayor a siete caracteres")
    private int codigo;
    @Size(min=1, max=20, message="El nombre es obligatorio y no debe sobrepasar los 20 caracteres")
    private String nombre;
    private String nombreComercial;
    private String direccion;
    @Size(min=1, max=20, message="El contacto es obligatorio y no debe sobrepasar los 20 caracteres")
    private String contacto;
    //@Size(min=1, max=20, message="El nombre es obligatorio y no debe sobrepasar los caracteres")
    @DecimalMin(value="0.0", message="El crédito debe ser mayor o igual a 0.0")
    @DecimalMax(value="100.0", message="El crédito no debe sobrepasar 100.0")
    private double credito; 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialjsf;

import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Named;
import javax.faces.view.ViewScoped;


/**
 *
 * @author 001la
 */
@Named
@ViewScoped
public class ClienteManagedBean implements Serializable{
    private Cliente cliente;
    ArrayList<Cliente> list = new ArrayList<>();
    
    public ClienteManagedBean() {
        this.cliente = new Cliente();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Cliente> getList() {
        return list;
    }

    public void setList(ArrayList<Cliente> list) {
        this.list = list;
    }
    
    public void addCliente(){
            list.add(cliente);
            this.cliente = new Cliente();
            System.out.println(list);
    }
}

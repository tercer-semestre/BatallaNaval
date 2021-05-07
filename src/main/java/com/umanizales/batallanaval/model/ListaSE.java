/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umanizales.batallanaval.model;

import java.io.Serializable;




public class ListaSE implements Serializable{
   private com.umanizales.batallanaval.model.Nodo cabeza;
   private int cont;

    public ListaSE() {
        this.cont=0;
    }

    public com.umanizales.batallanaval.model.Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(com.umanizales.batallanaval.model.Nodo cabeza) {
        this.cabeza = cabeza;
    }
   
    
    public void adicionarNodo(Object dato)
    {
        if(cabeza==null)
        {
            cabeza = new com.umanizales.batallanaval.model.Nodo(dato);
            cont++;
        }
        else
        {
            com.umanizales.batallanaval.model.Nodo temp= cabeza;
            while(temp.getSiguiente()!=null)
            {
                temp.setSiguiente(temp.getSiguiente());
            }
            // En el ultimo
            temp.setSiguiente(new com.umanizales.batallanaval.model.Nodo(dato));
            cont++;
        }
    }
    
    public String listadoNodos()
    {
        String listado="";
        com.umanizales.batallanaval.model.Nodo temp=cabeza;
        while(temp!=null)
        {
            listado = listado + temp.getDato();
            temp = temp.getSiguiente();
        }
        
        return listado;
    }

    public int getCont() {
        return cont;
    }
}

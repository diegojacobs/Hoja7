/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja7;

/**
 *
 * @author Diego Jacobs
 */
public class Nodo_Arbol {
    
    private Arbol arbol;
    private Nodo_Arbol Siguiente;
     
    public Nodo_Arbol(Arbol valor){
        arbol = valor;
        Siguiente = null;
    }
    
    public Arbol getArbol() {
        return arbol;
    }
    public void setArbol(Arbol arbol) {
        this.arbol = arbol;
    }
    public Nodo_Arbol getSiguiente() {
        return Siguiente;
    }
    public void setSiguiente(Nodo_Arbol siguiente) {
        Siguiente = siguiente;
    }
}

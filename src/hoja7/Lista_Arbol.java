/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja7;

import Hoja4.Listas;
import Hoja4.Nodo;
import Hoja4.Nodo_Simple;
import Hoja4.Lista_Simple;
/**
 *
 * @author Diego Jacobs
 */
public class Lista_Arbol {
    private Nodo_Arbol inicio;
    public Nodo_Arbol getInicio() {
        return inicio;
    }
    public void setInicio(Nodo_Arbol inicio) {
        this.inicio = inicio;
    }
     
    public Lista_Arbol(){
        inicio=null;
    }
    public void agregarOrdenados(Arbol arbol){
        Nodo_Arbol nuevo = new Nodo_Arbol(arbol);
        if(inicio == null)
            inicio=nuevo;
        else{
            Nodo_Arbol aux=inicio;
            Nodo_Arbol aux2=null;
            while(aux != null && (aux.getArbol().getRaiz().getFrec()<nuevo.getArbol().getRaiz().getFrec())){
                    aux2=aux;
                    aux=aux.getSiguiente();
                }
            if(aux2==null){
                nuevo.setSiguiente(inicio);
                inicio=nuevo;
            }
            else
                if(aux==null)
                    aux2.setSiguiente(nuevo);
                else{
                    aux2.setSiguiente(nuevo);
                    nuevo.setSiguiente(aux);
                }
        }
    }
    
    public void toListaArbol(Lista_Simple l){
       {
            String caracter="";
            Integer frecuencia=0;
            while(l.getInicio()!=null){
                caracter=l.getInicio().getCarac()+"";
                frecuencia=l.contarIguales(l.getInicio().getCarac());
                this.agregarOrdenados(new Arbol(caracter,frecuencia));
                frecuencia=0;
                caracter="";
            }
        }
    }
     
    public void imprimir(){
        if(inicio==null)
            System.out.println("Null");
        else{
            Nodo_Arbol aux=inicio;
            System.out.print("Inicio --> ");
            while(aux!=null){
                System.out.print(aux.getArbol().getRaiz().getCarac()+" : "+aux.getArbol().getRaiz().getFrec()+"  -> ");
                aux=aux.getSiguiente();
            }
            System.out.print(" Null\n");
        }
    }
     
    public Nodo sacarInicio(){
        Nodo_Arbol aux=inicio;
        inicio=aux.getSiguiente();
        aux.setSiguiente(null);
        return aux.getArbol().getRaiz();
    }
     
    public void obtenerArbol(){
        Nodo uno=null;
        Nodo dos=null;
        while(this.inicio.getSiguiente()!=null){
            uno=this.sacarInicio();
            dos=this.sacarInicio();
            Arbol nuevo=new Arbol(uno.getFrec()+dos.getFrec());
            nuevo.Agregar(uno, dos);
            this.agregarOrdenados(nuevo);
        }
        System.out.println("Arbol creado.");
    }
     
    public String obtenerHojas(String s,Nodo raiz){
        String cadena;
        if(raiz.getCarac()==s)
            return cadena;
        else
        {
            cadena=obtenerHojas(s+"0",raiz.getLeft());
            cadena=obtenerHojas(s+"1",raiz.getRight());
            return cadena;
        }
    }
}

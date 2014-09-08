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
public class Arbol {
    
    Nodo Raiz;
    
    public void Arbol()
    {
        Raiz = null;
    }
    
    public Arbol(int frec)
    {
        Raiz = new Nodo(frec,null);
    }
    public Arbol(String s,int frec)
    {
        Raiz = new Nodo(frec,s);
    }
    
    public void setRaiz(Nodo ra)
    {
        this.Raiz = ra;
    }
    
    public Nodo getRaiz()
    {
        return Raiz;
    }
    
    public void Agregar(Nodo izq,Nodo der)
    {
        Raiz.setLeft(izq);
        Raiz.setRight(der);
    }
    
   /* public String toString()
    {
        Nodo Inicio = Cabeza;
        String strLista = "";
        StringBuilder _sb = new    StringBuilder();
    
        if (Inicio != null)
        {        
            while (Inicio.getSiguiente() != null)
            {
                _sb.append(Inicio.getFrec());
                _sb.append("  -> ");            
                Inicio = Inicio.getRight();
            }
        }
    
        _sb.append(" null");
    
        return _sb.toString();
    }*/
}

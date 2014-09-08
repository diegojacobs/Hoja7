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
public class Nodo {
    
    protected String carac;
    protected int frec;
    protected Nodo right;
    protected Nodo left;
    
    public Nodo()
    {
        frec = 0;
        carac = null;
        right = null;
        left = null;
    }
    public Nodo(int valor, String a)
    {
        frec = valor;
        carac = a;
        right = null;
        left = null;
    }
   /* public Nodo(int valor, String a, Nodo der, Nodo izq)
    {
	frec = valor;
        carac = a;
        right = der;
        left = izq;
    }
    public Nodo(int valor, String a, Nodo izq)
    {
	frec = valor;
        carac = a;
        right = null;
        left = izq;
    }

   public Nodo(int valor, String a, Nodo der)
    {
	frec = valor;
        carac = a;
        right = der;
        left = null;
    }*/
    
    public void setFrec(int valor)
    {
        frec = valor;
    }
    public void setCarac(String a)
    {
        carac = a;
    }
    public void setLeft(Nodo next)
    {
        this.left = next;
    }
    public void setRight(Nodo next)
    {
        this.right = next;
    }
    public int getFrec ()
    {
        return frec;
    }
    
    public String getCarac ()
    {
        return carac;
    }
    public Nodo getLeft()
    {
        return left;
    }
    public Nodo getRight()
    {
        return right;
    }
    public boolean equals(Object other)
    {
        return this.carac.equals(((Nodo)other).getCarac());
    }

    public int compareTo(Object other)
    {
        /*int result;
        String otherValue = String.valueOf(((Nodo)other).getNum());
        result = String.valueOf(num).compareTo(otherValue);
        return result;*/
        return (((Comparable)other).compareTo(carac));
    }
}

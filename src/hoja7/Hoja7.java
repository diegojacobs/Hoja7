/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja7;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Diego Jacobs
 * @author Roberto Chiroy
 */
public class Hoja7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner _in  = new Scanner(System.in);
        
        String cadena;
        System.out.println("Ingrese su mensaje: ");
        cadena = _in.next();
        String listaC = new String();
        int[] listaF = new int[cadena.length()];
        
        for (int i=0;i<cadena.length();i++)
        {
            boolean band = false;
            for (int j=0;j<listaC.length();j++)
                if (listaC.substring(j, j).equals(cadena.substring(i, i)))
                    listaF[j]++;
                    band = true;
            if (!band){
                listaC=listaC+cadena.substring(i, i);
                listaF[i]=1;
            }
        }
        
        Arbol arb = new Arbol();
        Lista_Arbol Larb = new Lista_Arbol();
        
        Larb.agregarOrdenados(arb);
    }
    
}

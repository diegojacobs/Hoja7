package hoja07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author Roberto Chiroy -13027
 */
public class SecuenciaHuffman {
    private String cadena;
    private int contador =0;
    
    public SecuenciaHuffman(String ingreso){
        cadena = ingreso;
        
    }
    
    /*
    Tomado de :
    https://stackoverflow.com/questions/1090556/java-how-to-convert-hashmapstring-object-to-array
    https://stackoverflow.com/questions/13119926/find-duplicate-characters-in-a-string-and-count-the-number-of-occurances-using-j
    */
    public void obtenerFrecuencia(String cad){
        cadena = cad;
        Map<Character,Integer> codigos = new HashMap<Character,Integer>();
        for (int i = 0; i < cadena.length(); i++) {
          char c = cadena.charAt(i);
          if (codigos.containsKey(c)) {
            int cnt = codigos.get(c);
            codigos.put(c, ++cnt);
          } else {
            codigos.put(c, 1);
          }
        }
        String[] caracter = new String[codigos.size()];
        String[] fecuencia = new String[codigos.size()];
        Set entries = codigos.entrySet();
        Iterator entriesIterator = entries.iterator();

            int h = 0;
            while(entriesIterator.hasNext()){

                Map.Entry mapping = (Map.Entry) entriesIterator.next();

                caracter[i] = mapping.getKey().toString();
                fecuencia[i] = mapping.getValue().toString();

                h++;
            }
    }
        
        
        
    
 
}

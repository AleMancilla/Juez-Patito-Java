/*
 Descripción

Un string palindrome, es un string que se lee igual cuando es invertida. Por ejemplo ABA, ABBA son palindromes, pero ABB no lo es.

En este problema tú debes agregar caracteres a la derecha del string dada y convertirla en palindrome (Obviamente si ya es palindrome no es necesario hacer nada mas).

Entrada

Entrada terminara con el string “END”, cada línea tendrá un string no vacío de letras minúsculas. La longitud de la cadena será menor a 100000.


Salida

Para cada caso de prueba imprimir el palíndrome del string dado.

Ejemplo Entrada

aaaa
abba
amanaplanacanal
xyz
END

	
Ejemplo Salida

aaaa
abba
amanaplanacanalpanama
xyzyx
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author DELL-PC
 */
public class N_1012_Palindrome_Extendido {
    public static void main (String [] arg)
    {
        Scanner in = new Scanner(System.in);
        String x;
        x = in.next();
        while(!x.equals("END")){
        
            String aux2 = "";
        for (int i = 0; i < x.length(); i++) {
            aux2 = x.charAt(i)+aux2;
        }
        
        if(x.equals(aux2))
        {
            System.out.println(x);
        }
        else
        {
            String aux=convierte(x,aux2);
            System.out.println(aux);
        }
        
        x = in.next();
        }
        
    }
    
    
    public static String convierte(String x, String var)
    {
        String aux = x;
        String aux2= x.charAt(0)+"";
        
        for (int i = 1; i < aux.length(); i++) {
               if((var.substring(0,(aux.substring(i, aux.length())).length())).equals(aux.substring(i, aux.length())))
                {
                    aux2=aux+aux2;
                    return aux2;
                }
            
            aux2 =  x.charAt(i)+aux2;
        }
        return aux2;
    }
}

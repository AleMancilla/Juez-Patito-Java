/*
Descripción
Una cadena se llama bailarina si y solo si la primera letra es mayúscula y cada una de las demás letras es lo opuesto a la anterior letra (mayúscula, minúscula, mayúscula, minúscula, etc.).
Por ejemplo “A bC d” es una cadena bailarina, la primera letra es “A” mayúscula, la segunda letra es “b” minúscula, la siguiente letra es “C” mayúscula y por ultimo “d” es minúscula.

Entrada

La entrada consiste en un entero T
numero de casos de prueba, seguido por T+1

lineas, cada una contiene una cadena, puede ser que este vacia.

Salida

Imprimir T+1

lineas que contienen las cadenas bailarinas.

Ejemplo Entrada

5
o  
aaaabbbbaaaa  
Retweeted  
Like si resolviste el problema  
A 
s d ffd aa sds 

	
Ejemplo Salida

O
AaAaBbBbAaAa
ReTwEeTeD
LiKe Si ReSoLvIsTe El PrObLeMa
A
S d FfD aA sDs

 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author DELL-PC
 */
public class N_1006_Cadena_Bailarina {
    public static void main (String [] arg)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();//consume la linea de error
        String x;
        
        for (int i = 0; i <= n; i++) 
        {
            x=in.nextLine();
            char let;
            String aux="";
            int ascii ; 
            int j = 0;
            for (int r = 0; r < x.length(); r++) 
            {
                let=x.charAt(r);
                ascii = (int)let;
                if (ascii!=32)
                {
                if(j%2==0)
                {
                    if(ascii >=97 && ascii <=122)
                    {
                        ascii=ascii-32;
                        aux=aux+(char)ascii;
                    }
                    else
                    {
                        aux=aux+(char)ascii;
                    }
                }
                else
                {
                    if(ascii >=35 && ascii <=90)
                    {
                        ascii=ascii+32;
                        aux=aux+(char)ascii;
                    }
                    else
                    {
                        aux=aux+(char)ascii;
                    }
                }
                j++;
                }
                else
                {
                    aux=aux+let;
                }
                
            }
            System.out.println(aux);
        }
    }
    
}

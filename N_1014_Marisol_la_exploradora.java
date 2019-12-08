/*
Descripción

A Marisol le gusta visitar los lugares turísticos, hoy le toca conocer la ciudad de La Paz, una de las más conflictivas en Bolivia ya que hay marchas, bloqueos y no todas las calles son de doble sentido, existen N lugares turísticos y M rutas que conectan dichos sitios, ella quiere conocer los N lugares sin importar el orden.

Marisol necesita tu ayuda para saber si puede llegar de cualquier sitio a cualquier otro.

Entrada

La entrada consiste en varios casos de prueba, cada caso de prueba esta dado como sigue:

Dos enteros N, M (1<=N<=2000) seguido de M líneas, en cada línea dos enteros X, Y que quiere decir que se puede ir de X a Y (eso no implica que dé Y a X exista una ruta)

La entrada de datos termina con N=0 y M=0

Salida

Si se puede llegar de todos los lugares a todos los lugares imprime SI, caso contrario imprima NO

Ejemplo Entrada

3  1
1  2
3  3
1  2
2  3
3  1
2  1
1  2
0  0

	
Ejemplo Salida

NO
SI
NO

 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author DELL-PC
 */
public class N_1014_Marisol_la_exploradora {
    public void main (String[] arg)
    {
        Scanner in = new Scanner(System.in);
        int n=-1,m=-1;
            n=in.nextInt();
            m=in.nextInt();
            
        while (n!=0 && m !=0)
        {
            
            for(int i=0; i<m ; i++)
            {
                
            }
            n=in.nextInt();
            m=in.nextInt();
        }
    }
    
}

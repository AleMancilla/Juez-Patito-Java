/*
Problem A: Igual al Ultimo
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 139  Resuelto: 78
[Enviar][Estado][Foro]
Descripción

Escribir un programa que lea una secuencia no vacía de números enteros, y imprime cuántos
de ellos son iguales al último numero.
Entrada

La entrada consiste de múltiples secuencias. Cada secuencia comienza con un numero natural que indica la longitud de la secuencia. Termina cuando no hay más secuencias.
Salida

Imprima, para cada secuencia el numero de elementos igual al ultimo.
Ejemplo Entrada

10
2 2 1 1 3 5 3 5 3 3
10
3 1 1 4 1 1 5 2 2 3
10
5 5 2 2 4 2 2 5 2 5

	
Ejemplo Salida

4
2
4
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1300_Igual_al_Ultimo {
    public static void main(String[] arg)
    {
        Scanner in = new Scanner (System.in);
        while(in.hasNext())
        {
            int length=in.nextInt();
            int V[]=new int[length];
            for (int i = 0; i < length; i++) {
                V[i]=in.nextInt();
            }
            int aux = 0;
            
            for (int i = 0; i < length; i++) {
                if(V[i]==V[length-1])
                {
                    aux++;
                }
            }
            System.out.println(aux);
        }
    }
    
}

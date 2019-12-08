/*
Problem A: Invertir palabras 1
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 215  Resuelto: 73
[Enviar][Estado][Foro]
Descripción

Escribir un programa que lea lineas, y los imprima invirtiendo el orden de los caracteres de la frase.
Entrada

La entrada consiste en un número natural N, seguido de N lineas.
Salida

Imprima, línea por linea, las lineas con los caracteres invertidos.
Ejemplo Entrada

3
hola
toma refresco
que tal

	
Ejemplo Salida

aloh
ocserfer amot
lat euq
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1297_Invertir_palabras_1 {
    public static void main (String[] arg)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String aux="",pal;
        in.nextLine();
        for (int i = 0; i < n; i++) {
            pal=in.nextLine();
            for (int j = pal.length()-1; j >= 0; j--) {
                aux+=pal.charAt(j);
            }
            System.out.println(aux);
            aux="";
        }
    }
    
}

/*
Problem C: Invertir Secuencia
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 358  Resuelto: 78
[Enviar][Estado][Foro]
Descripción

Escribir un programa que lea una secuencia de números naturales, y los imprima en orden inverso.
Entrada

La entrada consiste de múltiples secuencias. Cada secuencia comienza con un numero natural que indica la longitud de la secuencia. Termina cuando no hay más secuencias.
Salida

Imprima, línea por linea, las secuencias en el orden inverso.
Ejemplo Entrada

6 10 11 12 15 14 13
0
2 22 21

	
Ejemplo Salida

13 14 15 12 11 10

21 22
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1298_Invertir_Secuencia {
    public static void main (String [] arg)
    {
        Scanner in = new Scanner(System.in);
        int n;
        int[]pila;
        while (in.hasNext()){
        n = in.nextInt();
        pila = new int[n];
        for (int i = 0; i < n; i++) {
            pila[i]=in.nextInt();
        }
        for (int i = n-1; i >= 0; i--) {
            System.out.print(pila[i]+" ");
        }
            System.out.println("");
    }}
    
}

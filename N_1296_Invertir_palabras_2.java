/*
Problem B: Invertir palabras 2
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 84  Resuelto: 52
[Enviar][Estado][Foro]
Descripción

Escribir un programa que lea lineas, y los imprime en orden inverso, invirtiendo también el orden de los caracteres de cada palabra.
Entrada

La entrada consiste en un número natural N, seguido de N lineas
Salida

Imprima, línea por linea, las lineas en el orden inverso, y con los caracteres de cada palabra invertida.
Ejemplo Entrada

3
hola
toma refresco
que tal

	
Ejemplo Salida

lat euq
ocserfer amot
aloh
 */
package juez.patito;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Alejandro
 */
public class N_1296_Invertir_palabras_2 {
    public static void main (String[] arg)
    {
        Scanner in = new Scanner(System.in);
        Stack<String> pila = new Stack<String>();
        int n = in.nextInt();
        String aux="",pal;
        in.nextLine();
        for (int i = 0; i < n; i++) {
            pal=in.nextLine();
            for (int j = pal.length()-1; j >= 0; j--) {
                aux+=pal.charAt(j);
            }
            pila.push(aux);
            aux="";
        }
        for (int i = 0; i < n; i++) {
            System.out.println(pila.pop());
        }
        
    }
    
}

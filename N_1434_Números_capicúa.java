/*
Problem E: Números capicúa
Time Limit: 2 Sec  Memory Limit: 128 MB
Enviar: 185  Resuelto: 77
[Enviar][Estado][Foro]
Descripción
Se dice que un número es capicúa cuando puede ser leído de la misma forma de izquierda a derecha, que de derecha a izquierda por ejemplo 1001 es un número capicúa, ya que 1001 al revés es también 1001 y 123 no es porque 123 al revés es 321.

Se pide realizar un programa para ver si un número es capicúa o no.

Entrada
La entrada consiste de un único número entero grande N (1 <= N <= 10¹⁸) .

Salida
Imprimir la letra 'S' (sin las comillas) si el número es capicúa y 'N' en caso de que no lo sea.

Ejemplo Entrada
1001
Ejemplo Salida
S
Ayuda
Ejemplo 2:


Entrada:


123



Salida:


N
*/
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1434_Números_capicúa {
    public static void main(String [] arg)
    {
        Scanner lee=new Scanner(System.in);
        String num=lee.next();
        String aux="";
        for(int i=num.length()-1; i>=0;i--)
        {
            char var=num.charAt(i);
            aux=aux+var;
        }
        System.out.println(aux);
    }
}

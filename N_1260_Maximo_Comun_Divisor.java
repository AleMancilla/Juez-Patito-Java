/*
 Problem A: Maximo Comun Divisor
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 259  Resuelto: 114
[Enviar][Estado][Foro]
Descripción
Dados dos números enteros a,b te piden hallar el máximo común divisor entre a y b.
Recordemos que el máximo común divisor es el número más grande que divide a ambos números.
Por ejemplo mcd(48,60) es 12. Veamos que 48  es divisible por 2,3,4,8,6,12 y el numero 60 es divisible por 2,3,4,5,6,10,12,15,20,30. El número más grande que divide a ambos es el 12. 
por esto decimos que mcd(48,60)=12.
Entrada
La primera línea contiene el numero n de casos de prueba. Luego siguen n lineas cada una con un caso de prueba. Cada caso de prueba contiene dos números enteros a y b separados por un espacio. 2≤a,b≤105
Salida
Escriba en una linea el máximo común divisor entre a y b.

Ejemplo Entrada
2
48 60
42 56
Ejemplo Salida
12
14
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1260_Maximo_Comun_Divisor {
    public static void main (String[] arg)
    {
        Scanner lee= new Scanner(System.in);
        int x,a,b,n=lee.nextInt();//casos de prueba
        for (int i = 0; i < n; i++) {
            a=lee.nextInt();
            b=lee.nextInt();
            if(a>b)//pregunto que numero es el mayor
            {
                x=a/2; //si a es mayor lo almaceno en x
            }
            else{x=b/2;}//si b es mayor lo almaceno en x
            // porque de la mitad del numero mayor no existe numero mayor que lo divida
            // ejemplo entro 10 y 16
            //el mayor es 16 si lo dividimos en 2 queda el numero 8 
            // esto quiere decir que del 8 para arriba no existe divisor
            // si de 16 tomamos la mitad 8 no existira numero mayor que divida a 16
            //apartir de ahi solo vamos restando y preguntando si se dividen entre ambos
            while(a%x!=0 || b%x!=0) // la O || es muy importante 
            {
                x--;
            }
            System.out.println(x);
        }
    }
}

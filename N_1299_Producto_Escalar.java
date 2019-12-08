/*
Problem E: Producto Escalar
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 86  Resuelto: 69
[Enviar][Estado][Foro]
Descripción

El producto escalar de dos vectores A=a1,a2,a3,.....an
, B=b1,b2,b3,...bn se define como
AxB=∑i=1naibi

]
Entrada

La primera linea especifica el numero de casos de prueba. Cada caso de prueba consiste de vectores A y B.  La primera linea de cada vector el numero elementos del vector. Luego siguen dos lineas la primera con los elementos del vector A y la segunda con los elementos del vector B.
Salida

En la salida imprima el producto escalar de cada caso de prueba.
Ejemplo Entrada

2
10
2 5 10 5 5 7 4 6 9 5 
9 7 8 2 3 9 3 10 7 5 
10
7 2 10 4 6 9 9 5 6 10 
5 8 9 8 2 6 6 5 9 10

	
Ejemplo Salida

381
472

Ayuda
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1299_Producto_Escalar {
    public static void main (String[] arg)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 0; i < n; i++) {
            int na=in.nextInt();
            int a[]=new int [na];
            for (int j = 0; j < na; j++) {
                a[j]=in.nextInt();
            }
            int b[]=new int [na];
            int suma =0;
            for (int j = 0; j < na; j++) {
                b[j]=in.nextInt();
                suma+=a[j]*b[j];
            }
            System.out.println(suma);
        }
    }
    
}

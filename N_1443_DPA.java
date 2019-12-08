/*
Problem B: DPA
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 96  Resuelto: 33
[Enviar][Estado][Foro]
Descripción

En teoria de numeros, un entero positivo llega a ser Deficiente, Perfecto o Abundante (DPA).

Dado un número n se debe imprimir si es Deficiente, Perfecto o Abundante.

Un número Deficiente es aquel en el que la suma de sus divisores propios positivos es menor que n.

Un número Perfecto es aquel en el que la suma de sus divisores propios positivos es igual que n.

Un número Abundante es aquel en el que la suma de sus divisores propios positivos es mayor que n.

Por ejemplo los divisores propios positivos de 6 son 1, 2 y 3 la suma da 6 que es igual a 6 por lo que es un número perfecto.


Entrada

La entrada tendra varios números n ( 1  <= n <= 100 )


Salida

Por cada número de la entrada se debe imprimir en una linea Deficiente, Perfecto o Abundante ( lo que corresponda ).
Ejemplo Entrada

5 
6 
16 
18 
21 
28 
29 
30 
40 
43 

	
Ejemplo Salida

Deficiente
Perfecto
Deficiente
Abundante
Deficiente
Perfecto
Deficiente
Abundante
Abundante
Deficiente

 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1443_DPA {
    public static void main (String[] arg)
    {
        Scanner in = new Scanner(System.in);
        int n;
        while (in.hasNext())
        {
            n=in.nextInt();
            int suma=0;
            for (int i = 1; i <= n/2; i++) {
                if(n%i==0)
                {
                    suma+=i;
                }
            }
            if(suma==n)
            {
                System.out.println("Perfecto");
            }
            else
            {
                if(suma>n)
                {
                    System.out.println("Abundante");
                }
                else
                {
                    System.out.println("Deficiente");
                }
            }
        }
    }
    
}

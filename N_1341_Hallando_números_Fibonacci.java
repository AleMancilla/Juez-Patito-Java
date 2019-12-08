/*
Problem E: Hallando números Fibonacci
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 237  Resuelto: 107
[Enviar][Estado][Foro]
Descripción

Los números de Fibonacci se calculan con la fórmula fn=fn−1+fn−2


Su tarea es la de imprimir el número Fibonacci correspondiente a un número de entrada. Por ejemplo el tercer Fibonacci es el 2

. Para cada número en la entrada imprima el número Fibonacci correspondiente.
Entrada

La entrada consiste de números a<100

que representa el número de Fibonaci que queremos hallar. Cada número está en una línea. La entrada termina cuando no hay más datos en la entrada.
Salida

Por cada línea de entrada debe imprimir el número Fibonacci correspondiente en una línea.
Ejemplo Entrada

4 
7 
8 
10 

	
Ejemplo Salida

3
13
21
55
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1341_Hallando_números_Fibonacci {
    public static void main(String [] arg)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            int n = in.nextInt();
            double x = (Math.pow(1.618034, n)-(Math.pow(-0.618034, n)))/2.23606797749979;
            System.out.println((int)x);
        }
    }
    
}

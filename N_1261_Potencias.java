/*
 Problem G: Potencias
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 402  Resuelto: 93
[Enviar][Estado][Foro]
Descripción
Se le pide escribir un programa para hallarlas potencias.
Entrada
La primera línea de la entrada contiene un numero entero que indica el numero de casos de prueba. 
Cada caso de prueba consiste de dos enteros a,b con b≥0.
Salida
Para cada par a,b imprima ab. En todos los casos ab≤262
Ejemplo Entrada
6
3 2
2 8
5 0
0 3
0 0
-2 3
Ejemplo Salida
9
256
1
0
1
-8
 */
package juez.patito;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1261_Potencias {
    public static void main(String[] args)
    {
        Scanner lee=new Scanner(System.in);
        int n = lee.nextInt();
        BigInteger res,a;
        int b;

        for (int i = 0; i < n; i++) {
            a = new BigInteger(lee.next());
            b = lee.nextInt();
            
            res = a.pow(b);
            System.out.println(res);
        }
    }
}

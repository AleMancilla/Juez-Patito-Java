/*
 Problem J: Mezclar en base dos
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 57  Resuelto: 40
[Enviar][Estado][Foro]
Descripción
Dado un numero natural x >0 con n bits denominaremos x1,x2,x3....xn su representación en base 2 donde xi representa el bit i.
Escriba un programa para mezclar la representación de dos números x,y que tiene el mismo numero de bits. 
Imprima en la salida x1y1....xnyn
Entrada
La entrada consiste de múltiples casos de prueba. Cada uno con dos números decimales, con el mismo numero de bits entre 0 y 30.

Salida
Para cada caso de prueba escriba la mezcla de los dos números como se explico.

Ejemplo Entrada
8 15
1 1
2 3
1000 600
900000 1000000
Ejemplo Salida
11010101
11
1101
11101011100111000000
1111011110011010100011101001100000000000
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1284_Mezclar_en_base_dos {
    public static void main(String[] arg)
    {
        Scanner lee=new Scanner(System.in);
        int a,b;
        String num;
        while(lee.hasNext())
        {
            a=lee.nextInt();
            b=lee.nextInt();
            num="";
            while(a!=0&&b!=0)
            {
                num=b%2+num;
                num=a%2+num;
                a=a/2;
                b/=2;//esto es igual a b=b/2;
            }
            System.out.println(num);
        }
    }
}

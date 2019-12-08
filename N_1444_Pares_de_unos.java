package juez.patito;




/*
Problem C: Pares de Unos
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 40  Resuelto: 13
[Enviar][Estado][Foro]
Descripción

Los números en su representación binaria están formados por unos y ceros. Se quiere conocer cuantas pares de unos seguidos existen en en un número. Por ejemplo el numero 710 en binario es 1112 y existe un par de unos. El numero 310 en binario es 112 tiene una pareja de unos. El numero 1510 en binario es 11112 y tiene dos pares de unos. El numero 1010 en binario es 10102 no tiene pares de unos.

Dado un numero decimal menor a 225 contar cuantos pares de unos existen en su representación binaria.
Entrada

La entrada consiste de varios casos de prueba y termina cuando no hay más datos. Cada caso de prueba consiste en un numero decimal menor a 225.
Salida

Escriba en la salida el numero de pares de unos que tiene el numero.
Ejemplo Entrada

3 
10 
15 
20 
255 

	
Ejemplo Salida

1
0
2
0
4


 */

/**
 *
 * @author Alejandro
 */
import java.util.Scanner;
public class N_1444_Pares_de_unos {
    public static void main ( String [] arg)
    {
        Scanner in = new Scanner(System.in);
        int n;
        while (in.hasNext())
        {
            int sum=0;
            int c=0;
            n=in.nextInt();
            while(n!=0)
            {
                if(n%2==1)
                {
                    c++;
                    if(c%2==0)
                    {
                        sum++;
                    }
                }
                else
                {
                    c=0;
                }
                n=n/2;
            }
            System.out.println(sum);
        }
    }
            
}

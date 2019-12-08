/*
 Problem K: Binario Inverso
Time Limit: 1 Sec  Memory Limit: 64 MB
Enviar: 624  Resuelto: 182
[Enviar][Estado][Foro]
Descripción
En colegio están aprendiendo a convertir de decimal a binario. Como es muy aburrido, te has propuesto invertir el equivalente binario y convertir este a decimal. Para esto debes construir un programa.

Por ejemplo la representación binaria del numero 13 es 1101 una vez invertido tenemos 1011 que es el numero 11. En el caso del numero 9 su representación es 1001 y el equivalente decimal despues de invertir es 9.

Entrada
La entrada consiste de varios casos de prueba. Cada caso de  prueba es un entero que viene en una sola línea. Termina cuando no hay mas datos en la entrada.

Salida
Por cada caso de prueba escriba en una línea el equivalente decimal de invertir el numero en binario.

Ejemplo Entrada
13
9
Ejemplo Salida
11
9
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1050_Binario_Inverso {
    public static void main(String[] arg)
    {
        Scanner lee= new Scanner(System.in);
        int a,b,pot,num;
        String bin;
        while(lee.hasNext())
        {
            a=lee.nextInt();
            bin="";
            num=0;
            while(a>0)
            {
                bin=bin+a%2;
                a/=2;//equivale a a=a/2
            }
            pot=0;
            for (int i = bin.length()-1; i >=0 ; i--) {
                char digito=bin.charAt(i);
                if(digito=='1')
                {
                    num=(int)(num+Math.pow(2, pot));
                }
                pot++;
            }
            System.out.println(num);
            
        }
    }
}

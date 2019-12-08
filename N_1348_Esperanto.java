/*
Problem B: Esperanto
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 260  Resuelto: 59
[Enviar][Estado][Foro]
Descripción

Los números son mucho más fáciles de escribir en esperanto que en español. Los números del 1 al 10 se detallan como sigue: unu
, du, tri, kvar, Kvin, ses, Sep, OK, Nau, dek. Números del 11 al 19 se escriben: dekunu, dekdu, ..., dekNau, un dek seguido de un solo espacio y el nombre del último dígito. Números 20 al 29 se escriben: dudek, dudekunu, dudekdu, ..., dudekNau. Del mismo modo, 30 es tridek, ..., 90 es Naudek. Sólo se unen el número de decena y dek. No hay excepciones como doce o quince

en español. 

Entrada
La entrada consiste en varios casos de prueba. Cada caso de prueba es un número entero n
, 1≤n≤99
en una línea. La entrada termina cuando no hay más datos en la entrada.

Salida

Por cada caso de prueba en la entrada escriba una línea con el nombre en esperanto.

Ejemplo Entrada

1 
90
11
77

	
Ejemplo Salida

unu
Naudek
dek unu
Sepdek Sep

 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1348_Esperanto {
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        String V[] = new String[10];
        V[0] = "dek";
        V[1] = "unu";
        V[2] = "du";
        V[3] = "tri";
        V[4] = "kvar";
        V[5] = "Kvin";
        V[6] = "ses";
        V[7] = "Sep";
        V[8] = "OK";
        V[9] = "Nau";
        while(in.hasNext())
        {
            int n=in.nextInt();
            if(n<20)
            {
                if(n<10) System.out.println(V[n]);
                else
                {if(n==10) System.out.println(V[0]);
                    else
                    {
                        System.out.println(V[0]+" "+V[n%10]);
                    }
                }
            }
            else
            {
                if(n%10==0)
                    System.out.println(V[n/10]+""+V[0]);
                else{System.out.println(V[n/10]+""+V[0]+" "+V[n%10]);}
            }
        }
    }
    
}

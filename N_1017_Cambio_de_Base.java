/*
Problem I: Cambio de Base
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 581  Resuelto: 239
[Enviar][Estado][Foro]
Descripción
En la entrada nos darán dos números n y a. Se conocen que el numero n convertido de decimal a un número en una de las bases 2,3,4,5,6,7,8,9 iguala al numero a.

Su trabajo es hallar la base B en la que esta el numero a

Entrada
La entrada consiste de varios casos de prueba. 
La primera línea contiene un numero (2 <= N <= 100) que indica el numero de casos de prueba.
Luego siguen N lineas con en los números n y a descritos anteriormente.

Se garantiza que todos los datos entran en tipos de dato long en su respectivo lenguaje de programación.

Salida
Imprima la base en la que se encuentra a. Si existieran varias bases cumplen la propiedad imprima la menor de todas.

Ejemplo Entrada
2
125 325
45 231
Ejemplo Salida
6
4
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1017_Cambio_de_Base {
    public static void main(String[] arg)
    {
        Scanner lee=new Scanner(System.in);
        int a,n,N=lee.nextInt();
        for (int i = 0; i < N; i++) {
            n=lee.nextInt();
            a=lee.nextInt();
            int aux=a,max=0;
            while(aux>0) { // esto saca la posible base
                if(aux%10>max)
                { max = aux%10;}
                aux=aux/10;
            }
            max=max+1;
            aux=n;
            int pot=1,num=0,cantidad=Integer.toString(n).length();
            while ( num!=a) {
                num=num+(aux%max)*pot;
                pot=pot*10;
                aux=aux/max;
                if(aux<=0 && num!=a)
                {
                    pot=1;
                    num=0;
                    max++;
                    aux=n;
                }
            }
            System.out.println(max);
        }
    }
    
}

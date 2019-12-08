/*
Problem B: Numeros de la Suerte
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 26  Resuelto: 6
[Enviar][Estado][Foro]
Descripción

Juanito ama los números de la suerte. Todo el mundo sabe que los números de la suerte son enteros positivos, cuya representación decimal (sin ceros a la izquierda) contiene sólo los dígitos afortunados x e y . Por ejemplo, si x  = 4 , e  y  = 7 , a continuación, los números 47, 744, 4 son afortunados.

Vamos a llamar a un número entero positivo a de la suerte, sin duda , si hay tales dígitos x e y (0 ≤  x ,  y  ≤ 9) , que la representación decimal del número de la (sin ceros a la izquierda) contiene sólo dígitos x e y .

Juanito tiene un número entero n . Él quiere saber cuántos números enteros positivos que no exceda n , son, sin duda, la suerte.Ayúdale, contar este número.

Entrada

La primera línea contiene un único entero n (1 ≤  n  ≤ 10^9 ) - Número de Juanito.



Salida

Imprimir un único entero que dice cuántos números enteros positivos que no excedan n son, sin duda, la suerte.


Ejemplo Entrada

10 
123 

	
Ejemplo Salida

10
113

 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1166_Numeros_de_la_Suerte {
    public static void main(String[]arg)
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {            
            int xx=in.nextInt();
            
            if(xx<=101)
            {
                System.out.println(xx);
            }
            else
            {   int cont=102;
                
                for (int ii = 102; ii <= xx; ii++) {
                    int i=ii;
                    int x=0;
                    while(i!=0)
                    {
                        if(i%10==(i/10)%10)
                        {
                            i=i/10;
                        }
                        else
                        {
                            x++;
                            i=i/10;
                        }
                    }
                    if(x<=2)
                    {
                        cont++;
                    }
                }
                System.out.println(cont);
            }
        }
    }
    
}

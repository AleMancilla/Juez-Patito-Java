/*
 Descripción
Bob el jardinero
Bob es un jardinero que esta preocupado por sus cultivos, el vende frutas, pero sus jardines son muy grandes y hasta que el cuente sus plantas se podria perder el cultivo, necesita tu ayuda para saber la cantidad de frutas que tiene.
En su jardin solo tiene 5 tipos de frutas, representadas por los caracteres 'a' 'e' 'i' 'o' 'u' (vocales). Bob es un coleccionista de plantas exoticas y tambien tiene 21 tipos de plantas exoticas representadas por las consonantes del alfabeto ingles.
Necesita de tu ayuda para saber el porcentaje total de frutas que tiene separadas por tipos.

Entrada
La entrada consiste en varios T (1<=T<=100) casos de prueba, cada caso de prueba esta compuesto por una cadena S (1<=|S|<=100000) solo letras minusculas que representa todos sus cultivos.

Salida
Por cada caso de prueba se debe imprimir el tipo de fruta seguido del porcentaje con 2 decimales de presicion (ver ejemplo de salida).

Ejemplo Entrada

3
aeiou 
ujigohaves 
up 

	
Ejemplo Salida

Caso 1:
a= 20.00
e= 20.00
i= 20.00
o= 20.00
u= 20.00
Caso 2:
a= 10.00
e= 10.00
i= 10.00
o= 10.00
u= 10.00
Caso 3:
a= 0.00
e= 0.00
i= 0.00
o= 0.00
u= 50.00


 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author DELL-PC
 */
public class N_1005_Bob_el_jardinero {
    
    public static void main (String[] arg)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String x;
        
        for (int i = 1; i <= n; i++) 
        {
            x=in.next();
            char c;
            int con=0;
            double[] voc = new double[6];
            for (int j = 0; j < x.length(); j++) {
                c=x.charAt(j);
                con++;
                switch (c)
                {
                    case 'a':
                        voc[1]++;
                        break;
                    case 'e':
                        voc[2]++;
                        break;
                    case 'i':
                        voc[3]++;
                        break;
                    case 'o':
                        voc[4]++;
                        break;
                    case 'u':
                        voc[5]++;
                        break;
                    default :
                        voc[0]++;
                        break;
                }    
                
            }
            //imprimiendo
            System.out.println("Caso "+i+":");
            System.out.printf("a= "+"%.2f",((voc[1]/con)*100));
                        System.out.println();
            System.out.printf("e= "+"%.2f",((voc[2]/con)*100));
                        System.out.println();
            System.out.printf("i= "+"%.2f",((voc[3]/con)*100));
                        System.out.println();
            System.out.printf("o= "+"%.2f",((voc[4]/con)*100));
                        System.out.println();
            System.out.printf("u= "+"%.2f",((voc[5]/con)*100));
                        System.out.println();
            
        }
    }
    
}

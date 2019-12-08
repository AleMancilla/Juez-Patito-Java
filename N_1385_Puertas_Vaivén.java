/*

Problem C: Puertas Vaivén
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 44  Resuelto: 22
[Enviar][Estado][Foro]
Descripción

claras. Esta puerta con bisagras en particular, funciona como sigue: La posición de reposo es la línea continua , la puerta se inserta en un extremo, y se balancea creando un ángulo (en la imagen,  corresponde al primer swing. Luego, cuando se libera la puerta, se desliza hacia el otro lado (esto se muestra en la imagen como segundo swing).  Pero esta vez, el ángulo que oscila se reduce a una fracción conocida del ángulo anterior. Luego, se invierte la dirección de nuevo y, una vez más, el ángulo reducido por la misma fracción. Una vez que el ángulo se reduce a 5,0

grados o menos, la puerta no oscila más, sino más bien, vuelve a la posición "de descanso".

Crear un programa que dado un ángulo inicial a desplazarse y una reducción y devuelve un entero correspondiente al número de veces que la puerta se balancea antes de llegar al reposo. Por ejemplo si se desplaza 50
grados y se reduce en 2 cada vez. Entonces al soltar la puerta el ángulo inicial se ve reducido de (1/2)∗(50)=25 grados en el primer vaivén. En este punto, la puerta debe revertir la dirección, y el oscilará a través de un ángulo de (1/2)∗(25)=12,5 grados. Continuando de esta manera, la puerta se girará una vez más a través de (1/2)∗(12,5)=6,25 grados, y luego a través de (1/2)∗(6,25)=3,125 grados. En este punto, la puerta se va a la posición de reposo. Por lo tanto, la respuesta correcta es de 4, ya que la puerta tomó 4

cambios antes de llegar al descanso.
Entrada

La entrada consiste de varios casos de prueba cada uno en una línea. Cada caso de prueba consiste de dos números enteros separados por un espacio.
El primero corresponde al desplazamiento d
de la puerta 0≤d≤90. Y el segundo a la reducción x en cada oscilación 0≤x≤10

. La entrada termina cuando no hay más datos.
Salida

La salida esta dada por un número entero en una línea que representa el número de oscilaciones que hará la puerta.
Ejemplo Entrada

50 2 
45 6  
23 3 
3 3 

	
Ejemplo Salida

4
2
2
0

 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1385_Puertas_Vaivén {
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        double d;
        int x;
        while(in.hasNext())
        {
         d= in.nextDouble();
         x=in.nextInt();
         int sum=0;
         while(d>5.0)
         {
             sum++;
             d=d/x;
         }
            System.out.println(sum);
        }
    }
    
}

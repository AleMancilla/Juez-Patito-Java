/*
Descripción
ado un vector V se quiere hallar la suma de un grupo de elementos contiguos cuya suma sea un valor dado S. No se puede re ordenar el vector. 

Por ejemplo si se tiene un vector con 6 elementos:

1	2	3	4	5	6
2	8	2	6	3	5
Ahora se quiere queremos hallar cuales son los elementos  cuya suma es 16, se observa que los elementos 2,3,4 suman 16 (8+2+6=16).  También los elementos 2+6+3+5=16. Sin embargo la respuesta correcta es 2,4 que significa que debemos sumar los valores desde la posición 2 hasta la 4 inclusive.
Entrada
La entrada consiste de varios datos de prueba. Cada caso de prueba consiste de dos líneas. La primera lí­nea tiene dos números, el primero es el numero de elementos del vector (0≤n≤107) y el segundo es la suma (1≤s≤1014) que de elementos contiguos que buscamos.

La segunda línea contiene los n elementos del vector separados por un espacio.

Los datos de entrada terminan cuando no hay mas datos.
Salida
En la salida imprima dos números que representan la posición del primer elemento y el ultimo elemento del arreglo, cuya suma de los elementos entre estos valores es la suma buscada. En caso de que no exista imprima -1.

Ejemplo Entrada
6 16
2 8 2 6 3 5 
7 5
1 4 4 1 0 0 5 
8 6
7 1 0 9 4 9 2 6 
9 32
7 9 3 6 4 3 2 5 2 
10 4
2 5 7 5 8 4 9 2 6 9
Ejemplo Salida
2 4
1 2
8 8
1 6
6 6
Ayuda
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1551_Sub_Suma {
    Scanner in =new Scanner(System.in);
    
    
    
}

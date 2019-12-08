/*
 Problem B: Saliendo del laberinto
Time Limit: 1 Sec  Memory Limit: 256 MB
Enviar: 100  Resuelto: 38
[Enviar][Estado][Foro]
Descripción
Pepe tiene un problema, se encuentra en un laberinto y quiere salir de el, pero ese no es su único conflicto, ya que algunos laberintos no tienen un camino a la salida, así es que Pepe debe abrirse camino rompiendo algunas paredes, pero como necesita salir rápido quiere romper el menor numero de paredes.

Ayuda a Pepe diciéndole el numero mínimo de paredes a derrumbar, si hay un camino entre la posición de Pepe y la salida imprimir 0 , si no hay un camino imprimir el numero de paredes a derrumbar.             

Nota: Pepe solo puede moverse hacia arriba, abajo, derecha e izquierda.

Entrada
 La entrada cociste en T casos de entrada, cada caso comienza con dos enteros N, M   el tamaño del laberinto $( 2 <= N,M <= 100 ). Seguido del laberinto que es una matriz de tamaño N x M (la esquina superior izquierda en 0,0)  que contiene los caracteres:

"#"     : Pared

"."      : Espacio libre 

Tambien se le dara la coordenada (X1, Y1) donde esta Pepe y la coordenada ( X2, Y2) donde esta la salida. Se garantiza que la salida y en la posicion de Pepe siempre se encuentra el caracter "."

Salida
Por cada caso de entrada imprimir en una linea “Laberinto #X: ” (X es el numero de laberinto) seguido de la respuesta.

Ejemplo Entrada
2
5 5
.#...
.#.#.
.#.#.
.#.#.
...#.
0 0
4 4
4 5
.#.#.
.#.#.
.#.#.
.#.#.
0 0
0 4
Ejemplo Salida
Laberinto #1: 0
Laberinto #2: 2
Ayuda
Fijate si debes ir izquierda o derecha, arriba o abajo para llegar al punto destino y tomala

 Desde el punto de inicio signado (x1, y1) recorre filas, columnas puede ser de arriba o abajo, izquierda o derecha, dependiendo del (x2, y2) a donde se pida llegar. Una vez que no exista movimiento hacia el lado que debes ir rompe un muro pero mientras exista camino no lo  hagas
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1004_Saliendo_del_laberinto {
    
    public static void main(String [] Argd)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            
            String [][] mat = new String [n][m];
            for (int j = 0; j < n; j++) {
                String linea = in.next();
                for (int k = 0; k < m; k++) {
                    mat[j][k] = linea.substring(k, k+1);
                    System.out.print(mat[j][k]);
                }
                System.out.println();
            }
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
        }
    }
    
    
    
}

/*
Problem A: Rumores
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 582  Resuelto: 162
[Enviar][Estado][Foro]
Descripción
Tenemos N personas que tienen relaciones de amistad entre si, resulta que si una persona tiene un rumor lo puede decir a todos sus amigos, al día siguiente sus amigos pasaran el rumor a sus amigos y así sucesivamente. Queremos saber si le llega el rumor de la persona X a la persona Y, ¿nos ayudas? ![image](http://200.7.160.55/judge/fckeditor/editor/images/smiley/msn/wink_smile.gif)
Entrada
La entrada consiste en un numero T casos de prueba, cada caso consiste en un numero N (2≤N≤100) el numero de personas numeradas de 1...N y M relaciones de amistad, seguido de M lineas que contienen pares de datos u, v esto quiere decir que u es amigo de v, por ultimo dos números X, Y.
Salida
La respuesta al problema en una linea por cada caso, si el rumor de X le llega a Y imprimir SI, imprimir NO si no es posible.
Ejemplo Entrada
1
4 3
1 2
2 3
3 4
1 4
Ejemplo Salida
SI
Ayuda
Considerar que la cantidad de personas que interactuaran es igual a N y M indica la cantidad de chismes que habrán osea lineas que introduzcan u, v de la sig forma. T

N M u, v ... u', v' x, y Union-Find
 */
package juez.patito;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1003_Rumores {
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt(); // numero de personas numeradas
            int m = in.nextInt(); // numero de relaciones de amistar
            int matris[][] = new int[2][m];
            for (int j = 0; j < m; j++) {
                int u = in.nextInt();
                int v = in.nextInt();
                matris[0][j]=u;
                matris[1][j]=v;
            }
            int x = in.nextInt();
            int y = in.nextInt();
            funcion(m,x,y,matris);
        }
        
    }

    private static void funcion(int m, int x, int y, int[][] matris) {
        List lista = new ArrayList();
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < m; i++) {
                if(x==matris[0][i])
                {
                    lista.add(matris[1][i]);
                }
            }
            int num = lista.size();
            x = (int) lista.get(num-1);
        }
        int num = lista.size();
        for (int i = 0; i < num; i++) {
            int var = (int) lista.get(i);
            if(var==y)
            {
                System.out.println("SI");
                return;
            }
        }
        System.out.println("NO");
        return;
    }
}

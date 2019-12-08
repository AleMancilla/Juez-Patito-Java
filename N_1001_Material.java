/*
 1001: Material
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 373  Resuelto: 186
[Enviar][Estado][Foro]
Descripción
Este problema trata de leer N numeros e imprimirlos.

Entrada
Un entero N seguido de N numeros

Salida
Los N numeros cada uno en una linea

Ejemplo Entrada
2
1
2
Ejemplo Salida
1
2
Ayuda
 1 2
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1001_Material {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            System.out.println(x);
        }
    }
}

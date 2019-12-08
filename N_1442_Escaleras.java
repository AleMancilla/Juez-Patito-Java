/*
Problem A: Escaleras
Time Limit: 5 Sec  Memory Limit: 128 MB
Enviar: 142  Resuelto: 24
[Enviar][Estado][Foro]
Descripción

Dado un número n se te pide dibujar una escalera de este tipo:

|_
|.|_
|...|_
|.....|_
|.......|_
|.........|_

Entrada

Se te dara n ( 0 <= n <= 100 ) que sera la altura de la escalera a dibujar.

Leer hasta fin de archivo.
Salida

Dibujar para cada n la escalera luego de cada escalera dibujada se te pide imprimir un salto de linea.
Ejemplo Entrada

5 
0  
2 

	
Ejemplo Salida

|_
|.|_
|...|_
|.....|_
|.......|_
|.........|_

|_

|_
|.|_
|...|_


 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1442_Escaleras {
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        String fi = "|_";
        while(in.hasNext())
        {
        int n = in.nextInt();
        if (n==0)
        {
            System.out.println("|_\n");
        }
        else
        {
            if (n==1){
                System.out.println("|_\n|.|_\n");
            }
            else {
                String prin = "|.";
                System.out.println("|_\n|.|_");
            for (int i = 2; i <= n; i++) {
                prin+="..";
                System.out.println(prin+fi);
            }
                System.out.println("");
            }
        }
        
        }
    }
    
}

/*
 Problem A: tablero
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 57  Resuelto: 27
[Enviar][Estado][Foro]
Descripción

Considere un tablero de ajedrez de r filas y c columnas. Cada casilla contiene de 0 a 9 monedas.
Considere que la equina superior izquierda es de color blanco. Por ejemplo un tablero con cuatro filas y cinco columnas es como sigue:

Tablero Ajedrez

Escriba un programa que calcule el numero total de monedas en las casillas blancas.
Entrada

La entrada comienza con un numero que indica la cantidad de tableros existentes.
Luego siguen dos números separados por espacios que representan r y c respectivamente.
Siguen r lineas con c caracteres donde (0≤r,c≤9

).
Salida

Por cada tablero escriba una linea con el numero total de monedas en casillas blancas.
Ejemplo Entrada

3  
3 4 
2735 
0479 
1508 
1 20  
01234567890123456789  
2 1   
4  
5  

	
Ejemplo Salida

19 
40 
4 
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1253_Tablero {
    public static void main (String[] arg)
    {
        Scanner in = new Scanner(System.in);
        int r,c,n;
        n=in.nextInt();
        
        for (int x = 0; x < n; x++) {
            r=in.nextInt();
            c=in.nextInt();
            int suma = 0;
            for (int i = 0; i < r; i++) {
                long aux;
                
                long num=in.nextInt();
                for (int j = c-1; j >= 0; j--) {
                    System.out.println("holaa"+j);
                    //int aux=in.nextInt();
                    aux=num%10;
                    System.out.println("\""+num);
                    num=num/10;
                    
                    if((i%2==0 && j%2==0)||(i%2==1 && j%2==1))
                    {
                        suma+=aux;
                    }
                
            
                } 
            }
            System.out.println(suma);
        }
    
    }
}
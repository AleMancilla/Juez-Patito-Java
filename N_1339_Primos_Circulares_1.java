/*
Problem A: Primos Circulares 1
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 27  Resuelto: 19
[Enviar][Estado][Foro]
Descripción

Definimos los números primos circulares aquellos que luego de rotar un numero siguen siendo primos. Por ejemplo
las rotaciones del numero primo 17 son: 17 y 71 ambos son primos asi decimos que el 17 es un numero primo circular. El numero 101 tiene tres rotaciones, si rotamos una vez tenemos 110 , la segunda rotación es 011, como vemos 110 no es primo por lo que el 101 no es un primo circular.

Entrada

La entrada es una lista de numeros cada uno en una linea y termina con un "-1". Todos los números son menores a 10,000.
Salida

Para cada número en la entrada en la salida escriba SI si el numero es circular y NO en otro caso.
Ejemplo Entrada

2
3
337
101
-1

	
Ejemplo Salida

SI
SI
SI
NO
 */
package juez.patito;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class N_1339_Primos_Circulares_1 {
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        int n=0;
       
            
            n=in.nextInt();
            while(n!=-1)
            {
            int po=(int)Math.log10(n);
            po=(int)Math.pow(10, po);
            
            int cont=0;
            int aux = n;
            for (int i = 0; i < n+"".length() ; i++) {
                for (int j = 2; j < aux/2; j++) {
                    if(aux%j==0)
                    {
                        cont++;
                        break;
                    }
                }
                if(cont==1)break;
                int var=aux%10;
                aux=aux/10;
                aux=(var*po)+aux;
               // System.out.println("numero "+aux);
            }
            if(cont==1)
                {
                    System.out.println("NO"); 
                }
                else
                {
                    System.out.println("SI");
                }
            n=in.nextInt();
        }
    }
    
}
